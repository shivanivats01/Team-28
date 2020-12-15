/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UserInterface.Patient.PatientHistoryJPanel;
import UserInterface.Patient.PatientReportsJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class SearchPatientJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Doctor doctor;
    private Ecosystem business;
    /**
     * Creates new form SearchPatientJPanel
     */
    public SearchPatientJPanel(JPanel CardLayoutJPanel, Doctor doctor, UserAccount account, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.doctor = doctor;
        this.account = account;
        this.business = business;
        
        populatePatientComboBox();
    }
    
    public ArrayList<Patient> getAssociatedPatients() {
        Set<String> patientIdSet = new HashSet<>();
        ArrayList<Patient> list = new ArrayList();
        
        ArrayList<WorkRequest> workRequestOfDoctor = this.account.getWorkQueue().getWorkRequestList();
        
        for(WorkRequest w: workRequestOfDoctor) {
            
            if(w.getStatus().equals("Physician appointment completed")) {
                String patientId = w.getSender().getId();
                if(!patientId.equals(this.account.getId()) &&!patientIdSet.contains(patientId)) {
                    list.add((Patient) w.getSender().getDetails());
                    patientIdSet.add(patientId);
                }
            }
        }
        
        return list;
        
    }
    
    public void populatePatientComboBox() {
        
        ArrayList<Patient> list = this.getAssociatedPatients();
        Patient[] comboBoxModel4 = list.toArray(new Patient[0]);
        
        
        patientComboBox.setModel(new DefaultComboBoxModel<Patient>(comboBoxModel4));
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        patientComboBox = new javax.swing.JComboBox<>();
        patientDetails = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        testResult = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        patientDetails.setText("Patient Details");
        patientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsActionPerformed(evt);
            }
        });

        jButton2.setText("Patient Medications");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        testResult.setText("Patient Test Results");
        testResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testResultActionPerformed(evt);
            }
        });

        backBtn.setText("< back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/company logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDetails)
                    .addComponent(jButton2)
                    .addComponent(testResult)
                    .addComponent(jLabel3)
                    .addComponent(backBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(patientDetails)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(testResult)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsActionPerformed
        // TODO add your handling code here:
        
        Patient p = (Patient) patientComboBox.getSelectedItem();
        if(p == null) {
            JOptionPane.showMessageDialog(null, "Please select a patient");
            return;
        }
        
        jSplitPane1.setRightComponent(new PatientHistoryJPanel(CardLayoutJPanel, p, this.account));
    }//GEN-LAST:event_patientDetailsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Patient p = (Patient) patientComboBox.getSelectedItem();
               
        
        if(p == null) {
            JOptionPane.showMessageDialog(null, "Please select a patient");
            return;
        }
        
        jSplitPane1.setRightComponent(new PhysicianPatientMedicationsJPanel1(CardLayoutJPanel, this.account,this.business, p));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void testResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testResultActionPerformed
        // TODO add your handling code here:
        Patient p = (Patient) patientComboBox.getSelectedItem();
        if(p == null) {
            JOptionPane.showMessageDialog(null, "Please select a patient");
            return;
        }
        
        jSplitPane1.setRightComponent(new PatientReportsJPanel(CardLayoutJPanel, p, this.account));
    }//GEN-LAST:event_testResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<Patient> patientComboBox;
    private javax.swing.JButton patientDetails;
    private javax.swing.JButton testResult;
    // End of variables declaration//GEN-END:variables
}
