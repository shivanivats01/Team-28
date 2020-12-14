/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class CreatePrescriptionJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Ecosystem business;
    /**
     * Creates new form CreatePrescriptionJPanel
     */
    public CreatePrescriptionJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, Doctor doctor) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account=account;
        this.business = business;
        
        populatePatientComboBox();
        populatePharmacyComboBox();

    }
    
    public ArrayList<Patient> getAssociatedPatients() {
        Set<String> patientIdSet = new HashSet<>();
        ArrayList<Patient> list = new ArrayList();
        
        ArrayList<WorkRequest> workRequestOfDoctor = this.account.getWorkQueue().getWorkRequestList();
        
        for(WorkRequest w: workRequestOfDoctor) {
            String patientId = w.getSender().getId();
            
            if(!patientId.equals(this.account.getId()) && !patientIdSet.contains(patientId)) {
                list.add((Patient) w.getSender().getDetails());
                patientIdSet.add(patientId);
            }
        }
        
        return list;
        
    }
    
    public void populatePatientComboBox() {
        
        ArrayList<Patient> list = this.getAssociatedPatients();
        Patient[] comboBoxModel4 = list.toArray(new Patient[0]);
        
        
        patientjComboBox.setModel(new DefaultComboBoxModel<Patient>(comboBoxModel4));
        
    
    
    }
    
    public void populatePharmacyComboBox() {
        
        ArrayList<Pharmacy> pharmacyList = business.getPharmacyDirectory().getPharmacyList();
        Pharmacy[] comboBoxModel4 = pharmacyList.toArray(new Pharmacy[0]);
        
        
        pharmacyListComboBox.setModel(new DefaultComboBoxModel<Pharmacy>(comboBoxModel4));
        
    
    
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
        jLabel3 = new javax.swing.JLabel();
        pharmacyListComboBox = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        sendRequestBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        patientjComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Create Prescription");

        jLabel2.setText("Prescribe Medicines:");

        jLabel3.setText("Select Pharmacy:");

        pharmacyListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyListComboBoxActionPerformed(evt);
            }
        });

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        sendRequestBtn.setText("Send Request");
        sendRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Patient ID:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pharmacyListComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientjComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendRequestBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBtn)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(patientjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pharmacyListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sendRequestBtn)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacyListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyListComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pharmacyListComboBoxActionPerformed

    private void sendRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestBtnActionPerformed
        // TODO add your handling code here:
        
        Patient patient = (Patient) patientjComboBox.getSelectedItem();
        Pharmacy pharmacy = (Pharmacy) pharmacyListComboBox.getSelectedItem();
        
        if(patient == null || pharmacy == null) {
            JOptionPane.showMessageDialog(null, "Please select all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        PharmacyRequest newRequest = new PharmacyRequest();
        newRequest.setSender(account);
        newRequest.setPatient(patient);
        newRequest.setReceiver(this.business.getUserAccountDirectory().getUserById(pharmacy.getPharmacyId()));
        newRequest.setStatus("pending pharmacy approval");
        newRequest.setRequestDate(new Date());
        newRequest.setMessage(jTextArea1.getText());
        
        this.business.getUserAccountDirectory().getUserById(pharmacy.getPharmacyId()).getWorkQueue().getWorkRequestList().add(newRequest);
        this.account.getWorkQueue().getWorkRequestList().add(newRequest);
        
        JOptionPane.showMessageDialog(null, "Request sent to pharmacy");
        
    }//GEN-LAST:event_sendRequestBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<Patient> patientjComboBox;
    private javax.swing.JComboBox<Pharmacy> pharmacyListComboBox;
    private javax.swing.JButton sendRequestBtn;
    // End of variables declaration//GEN-END:variables
}
