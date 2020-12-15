/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.Ecosystem;
import Business.Lab.Lab;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class LabWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkArea
     */
    JPanel CardLayoutJPanel;
    Patient patient;
    Lab lab;
    UserAccount account;
    Ecosystem business;

    public LabWorkArea(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, String type) {

        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.account=account;
        this.business= business;
        
        this.lab = (Lab) account.getDetails();
        
        jLabel1.setText("Welcome to weCare " + type);
        


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
        historyBtn = new javax.swing.JButton();
        AppointmentsBtn = new javax.swing.JButton();
        personalinfoBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        testInfoBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Navigate to:");

        historyBtn.setText("History");

        AppointmentsBtn.setText("Test Requests");
        AppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsBtnActionPerformed(evt);
            }
        });

        personalinfoBtn.setText("Lab Information");
        personalinfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalinfoBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        testInfoBtn.setText("Test Information");
        testInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personalinfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addComponent(backBtn)
                            .addComponent(testInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalinfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(testInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsBtnActionPerformed
        // TODO add your handling code here:

        LabTestRequestJPanel labTestRequestJPanel = new LabTestRequestJPanel(CardLayoutJPanel, account, business);
        CardLayoutJPanel.add("LabTestRequestJPanel", labTestRequestJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);

    }//GEN-LAST:event_AppointmentsBtnActionPerformed

    private void personalinfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalinfoBtnActionPerformed
        // TODO add your handling code here:

        LabInfoJpanel labInfoJpanel = new LabInfoJpanel(CardLayoutJPanel, this.lab);
        CardLayoutJPanel.add("LabInfoJpanel", labInfoJpanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_personalinfoBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void testInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testInfoBtnActionPerformed
        // TODO add your handling code here:
                
        TestInformationJPanel testInformationJPanel = new TestInformationJPanel(CardLayoutJPanel, this.lab);
        CardLayoutJPanel.add("TestInformationJPanel", testInformationJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
        
    }//GEN-LAST:event_testInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppointmentsBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton personalinfoBtn;
    private javax.swing.JButton testInfoBtn;
    // End of variables declaration//GEN-END:variables
}
