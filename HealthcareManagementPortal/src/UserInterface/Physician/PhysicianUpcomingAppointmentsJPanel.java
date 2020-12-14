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
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanivats
 */
public class PhysicianUpcomingAppointmentsJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;

    /**
     * Creates new form PatientUpcomingAppointmentsJPanel
     */
    public PhysicianUpcomingAppointmentsJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.populateTable();
        
    }

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        
        ArrayList<WorkRequest> upcomingAppointmentList = new ArrayList();
        for(WorkRequest w: appointmentList) {
            if(w.getStatus().equals("physician accepted")) {
                upcomingAppointmentList.add(w);
            }
        }
        
    
        int rowCount = jTable4.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(WorkRequest w: upcomingAppointmentList) {
            Object row[] = new Object[4];
        
            PhysicianRequest pr = (PhysicianRequest) w;
            
            Patient p = (Patient) this.business.getUserAccountDirectory().getUserById(pr.getSender().getId()).getDetails();
            Doctor d = (Doctor) this.account.getDetails();
        
            row[0] = p.getName();
            row[1] = d.getDepartment().getHospital().getName();
            row[2] = pr;
            row[3] = pr.getTime();
            
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
        completeBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Upcoming Appointments");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient", "Hospital", "Date Requested", "Time Slot"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jButton5.setText("Cancel Appointment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        completeBtn.setText("Complete Appointment");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(252, 252, 252)
                        .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jButton5)
                    .addContainerGap(556, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22)
                .addComponent(completeBtn)
                .addGap(99, 99, 99))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(406, Short.MAX_VALUE)
                    .addComponent(jButton5)
                    .addGap(98, 98, 98)))
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
        
        WorkRequest request = (WorkRequest) jTable4.getValueAt(rowCount, 2);
        
        request.setStatus("physician canceled");
        
        JOptionPane.showMessageDialog(null, "Appointment canceled");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        // TODO add your handling code here:
        
        
        int rowCount = jTable4.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest request = (WorkRequest) jTable4.getValueAt(rowCount, 2);
        request.setResolveDate(new Date());
        request.setStatus("Physician appointment completed");
        
        Patient  p = (Patient) request.getSender().getDetails();
        Doctor d = (Doctor) account.getDetails();
        
        PatientDetails newDetails = new PatientDetails(d, new Date(), "");
        p.getPatientDetails().add(newDetails);
        
        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(CardLayoutJPanel, newDetails, this.account);
        CardLayoutJPanel.add("PatientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
        
    }//GEN-LAST:event_completeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
