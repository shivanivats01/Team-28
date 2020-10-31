/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SearchFlights;

import Business.Customer;
import Business.Flight;
import Business.Seat;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jshar
 */
public class SeatingArrangementJPanel extends javax.swing.JPanel {

    private Seat seat;
    private JPanel CardSequenceJPanel;
    private Flight flight;
    private Customer customer;
    /**
     * Creates new form BookingJPanel
     */
    public SeatingArrangementJPanel(JPanel CardSequenceJPanel, Flight flight, Customer customer, Seat seat) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.flight = flight;
        this.customer = customer;
        this.seat = seat;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxSeatNumber = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        leftWindowRadioButton = new javax.swing.JRadioButton();
        leftMiddleRadioButton = new javax.swing.JRadioButton();
        rightAisleRadioButton = new javax.swing.JRadioButton();
        leftAisleRadioButton = new javax.swing.JRadioButton();
        rightWindowRadioButton = new javax.swing.JRadioButton();
        rightMiddleRadioButton = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Seating Arrangement");

        jLabel2.setText("Seat No.");

        boxSeatNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        jLabel3.setText("Left");

        jLabel4.setText("Right");

        leftWindowRadioButton.setText("Window");
        leftWindowRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftWindowRadioButtonActionPerformed(evt);
            }
        });

        leftMiddleRadioButton.setText("Middle");
        leftMiddleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftMiddleRadioButtonActionPerformed(evt);
            }
        });

        rightAisleRadioButton.setText("Aisle");
        rightAisleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightAisleRadioButtonActionPerformed(evt);
            }
        });

        leftAisleRadioButton.setText("Aisle");
        leftAisleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftAisleRadioButtonActionPerformed(evt);
            }
        });

        rightWindowRadioButton.setText("Window");
        rightWindowRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightWindowRadioButtonActionPerformed(evt);
            }
        });

        rightMiddleRadioButton.setText("Middle");
        rightMiddleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightMiddleRadioButtonActionPerformed(evt);
            }
        });

        btnNext.setText("Confirm");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(leftWindowRadioButton)
                                .addComponent(leftMiddleRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(leftAisleRadioButton, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3))
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rightAisleRadioButton)
                            .addComponent(rightMiddleRadioButton)
                            .addComponent(rightWindowRadioButton)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(boxSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftWindowRadioButton)
                    .addComponent(rightWindowRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rightMiddleRadioButton)
                    .addComponent(leftMiddleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rightAisleRadioButton)
                    .addComponent(leftAisleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(130, 130, 130))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void leftWindowRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftWindowRadioButtonActionPerformed
        // TODO add your handling code here:
        if(leftWindowRadioButton.isSelected()) {
            leftAisleRadioButton.setSelected(false);
            leftMiddleRadioButton.setSelected(false);
            rightAisleRadioButton.setSelected(false);
            rightMiddleRadioButton.setSelected(false);
            rightWindowRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_leftWindowRadioButtonActionPerformed

    private void leftMiddleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftMiddleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(leftMiddleRadioButton.isSelected()) {
            leftAisleRadioButton.setSelected(false);
            leftWindowRadioButton.setSelected(false);
            rightAisleRadioButton.setSelected(false);
            rightMiddleRadioButton.setSelected(false);
            rightWindowRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_leftMiddleRadioButtonActionPerformed

    private void rightAisleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightAisleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(rightAisleRadioButton.isSelected()) {
            leftAisleRadioButton.setSelected(false);
            leftWindowRadioButton.setSelected(false);
            leftMiddleRadioButton.setSelected(false);
            rightMiddleRadioButton.setSelected(false);
            rightWindowRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_rightAisleRadioButtonActionPerformed

    private void leftAisleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftAisleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(leftAisleRadioButton.isSelected()) {
            rightAisleRadioButton.setSelected(false);
            leftWindowRadioButton.setSelected(false);
            leftMiddleRadioButton.setSelected(false);
            rightMiddleRadioButton.setSelected(false);
            rightWindowRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_leftAisleRadioButtonActionPerformed

    private void rightWindowRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightWindowRadioButtonActionPerformed
        // TODO add your handling code here:
        if(rightWindowRadioButton.isSelected()) {
            leftAisleRadioButton.setSelected(false);
            leftMiddleRadioButton.setSelected(false);
            rightAisleRadioButton.setSelected(false);
            rightMiddleRadioButton.setSelected(false);
            leftWindowRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_rightWindowRadioButtonActionPerformed

    private void rightMiddleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightMiddleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(rightMiddleRadioButton.isSelected()) {
            leftAisleRadioButton.setSelected(false);
            leftWindowRadioButton.setSelected(false);
            rightAisleRadioButton.setSelected(false);
            leftMiddleRadioButton.setSelected(false);
            rightWindowRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_rightMiddleRadioButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        // TODO add your handling code here:
        if(boxSeatNumber.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        if(leftAisleRadioButton.isSelected() == false && leftWindowRadioButton.isSelected() == false && 
                leftMiddleRadioButton.isSelected() == false && rightMiddleRadioButton.isSelected() == false &&
                rightAisleRadioButton.isSelected() == false && rightWindowRadioButton.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Please select Seat preference");
            return;
        }
        
        String str = "";
        if(leftWindowRadioButton.isSelected()) {
            str = String.valueOf(boxSeatNumber.getSelectedIndex()) + "A";
        }
        else if(leftMiddleRadioButton.isSelected()) {
            str = String.valueOf(boxSeatNumber.getSelectedIndex()) + "B";
        }
        else if(leftAisleRadioButton.isSelected()) {
            str = String.valueOf(boxSeatNumber.getSelectedIndex()) + "C";
        }
        else if(rightAisleRadioButton.isSelected()) {
            str = String.valueOf(boxSeatNumber.getSelectedIndex()) + "D";
        }
        else if(rightMiddleRadioButton.isSelected()) {
            str = String.valueOf(boxSeatNumber.getSelectedIndex()) + "E";
        }
        else if(rightWindowRadioButton.isSelected()) {
            str = String.valueOf(boxSeatNumber.getSelectedIndex()) + "F";
        }
        
        System.out.println(flight.getFlightNumber());
        if(seat.getSeats(flight.getFlightNumber()).contains(str)) {
            JOptionPane.showMessageDialog(null,"Seat Already Selected by another customer");
            return;
        }
        else {
            seat.setSeat(flight.getFlightNumber(), str); 
            customer.addFlightInfo(flight, str);
            JOptionPane.showMessageDialog(null,"Flight Booked");
            CardSequenceJPanel.remove(this);
            CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
            layout.previous(CardSequenceJPanel);
            
        }
        
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSeatNumber;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton leftAisleRadioButton;
    private javax.swing.JRadioButton leftMiddleRadioButton;
    private javax.swing.JRadioButton leftWindowRadioButton;
    private javax.swing.JRadioButton rightAisleRadioButton;
    private javax.swing.JRadioButton rightMiddleRadioButton;
    private javax.swing.JRadioButton rightWindowRadioButton;
    // End of variables declaration//GEN-END:variables
}
