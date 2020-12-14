/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import UserInterface.Pharmacy.PharmacyInfoJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class WelcomePharmacyJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Pharmacy pharmacy;
    /**
     * Creates new form WelcomePharmacyJPanel
     */
    public WelcomePharmacyJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.pharmacy = (Pharmacy) account.getDetails();
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
        PastPrescriptionsBtn = new javax.swing.JButton();
        InventoryStockBtn = new javax.swing.JButton();
        pendingPrescriptionsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Welcome To WeCare");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Navigate to:");

        PastPrescriptionsBtn.setText("Past Prescriptions");
        PastPrescriptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastPrescriptionsBtnActionPerformed(evt);
            }
        });

        InventoryStockBtn.setText("Inventory Stock");
        InventoryStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryStockBtnActionPerformed(evt);
            }
        });

        pendingPrescriptionsBtn.setText("Pending Prescriptions");
        pendingPrescriptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingPrescriptionsBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pendingPrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PastPrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InventoryStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBtn)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PastPrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendingPrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InventoryStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PastPrescriptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastPrescriptionsBtnActionPerformed
        // TODO add your handling code here:
        PastPrescriptionsJPanel pastPrescriptionsJPanel = new PastPrescriptionsJPanel(CardLayoutJPanel, account, this.pharmacy);
        CardLayoutJPanel.add("PastPrescriptionsJPanel", pastPrescriptionsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_PastPrescriptionsBtnActionPerformed

    private void pendingPrescriptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingPrescriptionsBtnActionPerformed
        // TODO add your handling code here:
        PendingPrescriptionsJPanel pendingPrescriptionsJPanel = new PendingPrescriptionsJPanel(CardLayoutJPanel, account, this.pharmacy, business);
        CardLayoutJPanel.add("PendingPrescriptionsJPanel", pendingPrescriptionsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_pendingPrescriptionsBtnActionPerformed

    private void InventoryStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryStockBtnActionPerformed
        // TODO add your handling code here:
        InventoryStockJPanel inventoryStockJPanel = new InventoryStockJPanel(CardLayoutJPanel, account, this.pharmacy);
        CardLayoutJPanel.add("InventoryStockJPanel", inventoryStockJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_InventoryStockBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InventoryStockBtn;
    private javax.swing.JButton PastPrescriptionsBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton pendingPrescriptionsBtn;
    // End of variables declaration//GEN-END:variables
}
