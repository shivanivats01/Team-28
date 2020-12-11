/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Appointment.Appointment;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Slot.Slot;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riyamoitra
 */
public class PhysicianWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhysicianWorkAreaJPanel
     */
    
    private Ecosystem business;
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    
    

    public PhysicianWorkAreaJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.account= account;
        this.business= business;
        
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        giveAppointmentJButton = new javax.swing.JButton();
        processPatientJButton = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Appointment ID", "Patient Name", "Slot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        giveAppointmentJButton.setText("Confirm Appointment");
        giveAppointmentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveAppointmentJButtonActionPerformed(evt);
            }
        });

        processPatientJButton.setText("Process");
        processPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processPatientJButtonActionPerformed(evt);
            }
        });

        backbtn.setText("<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(giveAppointmentJButton)
                        .addGap(18, 18, 18)
                        .addComponent(processPatientJButton)
                        .addGap(77, 77, 77))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(backbtn))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveAppointmentJButton)
                    .addComponent(processPatientJButton))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
      //  populateTable();
       
       
    }//GEN-LAST:event_refreshJButtonActionPerformed

   
    
  /* 
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(Appointment appointment: business.getHospitalDirectory().getHospital().getAppointmentSchedule()){ // Hospital's index needs to be changed
            if(appointment.getDoctor() != null){
                if(appointment.getDoctor().getDoctorId().equalsIgnoreCase(account.getEmployee().getName())){
                Object[] row = new Object[7];
                    row[0] = appointment.getMessage();
                    row[1] = appointment.getSender();
                    row[2] = appointment.getReceiver();
                    row[3] = appointment.getStatus();
                    row[4] = appointment.getAppointmentId();
                    row[5] = appointment.getPatient().getAddress();
                    row[6] = appointment.getHospital().getAddress();
                    model.addRow(row);
            }
            }
        }
    } */
    
    private void giveAppointmentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveAppointmentJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
        
// AppointmentSchedule is not associated with Hospital Directory
        
/*
        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Appointment appointment = business.getHospitalDirectory().getAppointmentSchedule().getAppointmentByAppointmentId(selectedOrderId);

        appointment.setStatus("Appointment Confirmed");
        JOptionPane.showMessageDialog(null, "Appointment status updated!");
        //populateTable();
*/
    }//GEN-LAST:event_giveAppointmentJButtonActionPerformed

    private void processPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processPatientJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
// AppointmentSchedule is not associated with Hospital Directory
        /*
        String selectedAppointmnetId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Appointment appointment = business.getAppointmentSchedule().getOrderByOrderId(selectedAppointmentId);

        appointment.setStatus("Patient Diagnosed");
        
        JOptionPane.showMessageDialog(null, "Appointment status updated!");
       // populateTable();
*/
    }//GEN-LAST:event_processPatientJButtonActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        
         CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton giveAppointmentJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processPatientJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
