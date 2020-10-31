/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SearchFlights;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Customer;
import Business.Flight;
import Business.FlightDirectory;
import Business.Seat;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanivats
 */
public class FindFlights extends javax.swing.JPanel {
    
    private JPanel CardSequenceJPanel;
    private FlightDirectory flightDirectory;
    private AirlinerDirectory airlineDirectory;
    private Airliner airliner;
    private Customer customer;
    private Seat seat;

    /**
     * Creates new form FindFlights
     */
    public FindFlights(JPanel CardSequenceJPanel,AirlinerDirectory airlineDirectory,FlightDirectory flightDirectory, Customer customer, Seat seat ) {
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlineDirectory = airlineDirectory;
        this.flightDirectory = flightDirectory;
        this.customer = customer;
        this.seat = seat;
        
        initComponents();
        // Commented as not required anymore.
//        populateAirlineCombo();
    }
    
    public void populateTable(ArrayList<Flight> a) {
        DefaultTableModel dtm = (DefaultTableModel) tblFlightDetails.getModel();
        dtm.setRowCount(0);
        
        for(Flight f : a){
            Object [] row = new Object[5];
            row[0] = f;
            row[1] = f.getAirlineName();
            row[2] = f.getSource();
            row[3] = f.getDestination();
            row[4] = f.getStartDate();
            
            row[5] = f.getPrice();
//            row[5] = f.getEndDate();
            dtm.addRow(row);
        }
    }
    // COmmented as not required anymore.
//    public void populateSourceCombo() {
//        comboBoxSource.removeAllItems();
//        
//        for(String ) {
//            
////        }
//    }
    
//    public void populateAirlineCombo()
//    {
//        airlineCombobox.removeAllItems();
//        
//        for (String s : airlineDirectory.getAirlineNames())
//                {
//                   airlineCombobox.addItem(s);
//                }
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFlightDetails = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txtFlightNumber = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnBookNow = new javax.swing.JButton();
        txtSource = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        txtAirliner = new javax.swing.JTextField();
        btnViewBookedTickets = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        tblFlightDetails.setForeground(new java.awt.Color(0, 51, 102));
        tblFlightDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight No.", "Airliner Name", "Flying From", "Flying To", "Departing", "Price"
            }
        ));
        jScrollPane4.setViewportView(tblFlightDetails);

        jTextField3.setText("Select Airline:");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("From:");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jTextField5.setText("To:");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setText("Flight Number:");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setText("Date:");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        btnBookNow.setText("Book Now");
        btnBookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNowActionPerformed(evt);
            }
        });

        txtDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinationActionPerformed(evt);
            }
        });

        btnViewBookedTickets.setText("View Booked Tickets");
        btnViewBookedTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookedTicketsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFlightNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtSource)
                            .addComponent(txtDestination, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAirliner, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnViewBookedTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnBookNow, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnSearch)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookNow)
                    .addComponent(btnViewBookedTickets))
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnBookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNowActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlightDetails.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first to Book flight", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Flight flight = (Flight) tblFlightDetails.getValueAt(selectedRow, 0);
        SeatingArrangementJPanel bookPanel = new SeatingArrangementJPanel(CardSequenceJPanel, flight,customer,seat);
        CardSequenceJPanel.add("BookingJPanel", bookPanel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnBookNowActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Flight> temp = new ArrayList<>();
        ArrayList<Flight> flightList = new ArrayList<>();
        
        
        for (Airliner a : airlineDirectory.getAirlineList()){
            flightList.addAll(a.getFlightDirectory().getFlightList());
        }
        
        String airlinerName = txtAirliner.getText();
        if (!airlinerName.isEmpty()) {
            System.out.println(airlinerName);
            for(Flight a : flightList) {
                System.out.println(a.getAirlineName());
                if(a.getAirlineName().equals(airlinerName)) {
                    temp.add(a);
                }
            }
            flightList = temp;
        }
        String source = txtSource.getText();
        if (!source.isEmpty()) {
            temp = new ArrayList<>();
            for(Flight f : flightList) {
                if(f.getSource().equals(source)) {
                    temp.add(f);
                }
            }
            flightList = temp;
            
        }
        
        String destination = txtDestination.getText();
        if (!destination.isEmpty()) {
        temp = new ArrayList<>();
            for(Flight f : flightList) {
                if(f.getDestination().equals(destination)) {
                    temp.add(f);
                }
            }
            flightList = temp;
        }

        
        temp = new ArrayList<>();
        try {
            if(!txtFlightNumber.getText().isEmpty()) {
                int flightNumber = Integer.parseInt(txtFlightNumber.getText());
                for(Flight f : flightList) {
                    if(f.getFlightNumber() == flightNumber) {
                        temp.add(f);
                    }
                }
                flightList = temp;
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Flight Number should have integer value only");
            return;
        }
        
        temp = new ArrayList<>();
        if(!txtDate.getText().isEmpty()) {
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtDate.getText());
                for(Flight f : flightList) {
                    if(f.getStartDate().equals(date)) {
                        temp.add(f);
                    }
                }
                flightList = temp;
            } catch (Exception e) {
                System.out.println("Wrong format for Date");
                return;
            }
        }
        
        
        if(flightList.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No Flight Availabale");
            
        } 
        populateTable(flightList);
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinationActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnViewBookedTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookedTicketsActionPerformed
        // TODO add your handling code here:
        ViewTicketJPanel viewPanel = new ViewTicketJPanel(CardSequenceJPanel ,customer,seat);
        CardSequenceJPanel.add("ViewTicketsJPanel", viewPanel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnViewBookedTicketsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookNow;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewBookedTickets;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblFlightDetails;
    private javax.swing.JTextField txtAirliner;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
