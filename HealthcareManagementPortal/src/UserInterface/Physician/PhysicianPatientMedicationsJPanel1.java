/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Doctor.Doctor;
import UserInterface.Patient.*;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanivats
 */
public class PhysicianPatientMedicationsJPanel1 extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;
    Patient patient;

    /**
     * Creates new form PatientUpcomingAppointmentsJPanel
     */
    public PhysicianPatientMedicationsJPanel1(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, Patient patient) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        this.patient = patient;
        
        this.populateTable();
        
    }

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        
        Set<String> pharmacyIds = new HashSet();
        for(Pharmacy ph : this.business.getPharmacyDirectory().getPharmacyList()) {
            pharmacyIds.add(ph.getPharmacyId());
        }
        
        ArrayList<PharmacyRequest> upcomingAppointmentList = new ArrayList();
        for(WorkRequest w: appointmentList) {
            
            if(w.getSender().getId().equals(account.getId()) && pharmacyIds.contains(w.getReceiver().getId())) {
               PharmacyRequest pr = (PharmacyRequest) w;
              if(pr.getPatient().getPatientID().equals(patient.getPatientID())) {
                upcomingAppointmentList.add(pr);
                
              }  
            }
            
           
        }
        
    
        int rowCount = jTable4.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(PharmacyRequest w: upcomingAppointmentList) {
            Object row[] = new Object[5];
        
            Patient p = w.getPatient();
            Doctor d = (Doctor) this.account.getDetails();
        
            row[0] = business.getUserAccountDirectory().getUserById(w.getReceiver().getId());
            row[1] = w;
            row[2] = w.getResolveDate();
            row[3] = w.getStatus();
            row[4] = w.getMessage();
            
            model.addRow(row);
            
        }     
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Patient Medications");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pharmacy", "Date Requested", "Date Completed", "Status", "Prescription Details"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jButton5.setText("Cancel ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton5)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int rowCount = jTable4.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        PharmacyRequest request = (PharmacyRequest) jTable4.getValueAt(rowCount, 2);
        
        if(request.getStatus().equals("pending pharmacy approval")) {
            request.setStatus("physician canceled medication");
            JOptionPane.showMessageDialog(null, "Appointment canceled");
        } else {
            JOptionPane.showMessageDialog(null, "You can only cancel pending requests");
        }
        
        populateTable();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
