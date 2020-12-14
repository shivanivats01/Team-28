/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class SystemAdminPortalJPanel extends javax.swing.JPanel {

    
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;
    
    /**
     * Creates new form SystemAdminPortalJPanel1
     */
    public SystemAdminPortalJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem ecosystem) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account = account;
        this.business = ecosystem;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalPortalBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        patientPortalBtn = new javax.swing.JButton();
        pharmacyBtn = new javax.swing.JButton();
        labbtn = new javax.swing.JButton();
        ambulancebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        hospitalPortalBtn.setText("hospital portal");
        hospitalPortalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalPortalBtnActionPerformed(evt);
            }
        });

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        patientPortalBtn.setText("patient portal");
        patientPortalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientPortalBtnActionPerformed(evt);
            }
        });

        pharmacyBtn.setText("pharmacy portal");
        pharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyBtnActionPerformed(evt);
            }
        });

        labbtn.setText("Lab Portal");
        labbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labbtnActionPerformed(evt);
            }
        });

        ambulancebtn.setText("Ambulance Portal");
        ambulancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulancebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pharmacyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientPortalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ambulancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hospitalPortalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(backBtn)
                    .addContainerGap(375, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(ambulancebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientPortalBtn)
                    .addComponent(hospitalPortalBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pharmacyBtn)
                    .addComponent(labbtn))
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(backBtn)
                    .addContainerGap(281, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientPortalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientPortalBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminPatientPortalJPanel systemAdminPatientPortalJPanel = new SystemAdminPatientPortalJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("SystemAdminPatientPortalJPanel", systemAdminPatientPortalJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_patientPortalBtnActionPerformed

    private void hospitalPortalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalPortalBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminHospitalPortalJPanel systemAdminHospitalPortalJPanel = new SystemAdminHospitalPortalJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("SystemAdminHospitalPortalJPanel", systemAdminHospitalPortalJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_hospitalPortalBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void pharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminPharmacyJPanel systemAdminPharmacyJPanel = new SystemAdminPharmacyJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("SystemAdminPharmacyJPanel", systemAdminPharmacyJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_pharmacyBtnActionPerformed

    private void ambulancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulancebtnActionPerformed
        // TODO add your handling code here:
        SystemAdminAmbulanceJPanel systemAdminAmbulanceJPanel = new SystemAdminAmbulanceJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("SystemAdminAmbulanceJPanel", systemAdminAmbulanceJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
        
    }//GEN-LAST:event_ambulancebtnActionPerformed

    private void labbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labbtnActionPerformed
        // TODO add your handling code here:
        SystemAdminLabJPanel systemAdminLabJPanel = new SystemAdminLabJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("SystemAdminLabJPanel", systemAdminLabJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
        
    }//GEN-LAST:event_labbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulancebtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton hospitalPortalBtn;
    private javax.swing.JButton labbtn;
    private javax.swing.JButton patientPortalBtn;
    private javax.swing.JButton pharmacyBtn;
    // End of variables declaration//GEN-END:variables
}
