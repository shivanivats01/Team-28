/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.Lab.Lab;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import UserInterface.LoginJPanel;
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
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();


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
        logOutBtn = new javax.swing.JButton();
        testInfoBtn = new javax.swing.JButton();
        personalinfoBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

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

        logOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        testInfoBtn.setText("Test Information");
        testInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testInfoBtnActionPerformed(evt);
            }
        });

        personalinfoBtn1.setText("Manage Tests");
        personalinfoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalinfoBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalinfoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalinfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personalinfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personalinfoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
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

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(business);
        LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void testInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testInfoBtnActionPerformed
        // TODO add your handling code here:
                
        
        
    }//GEN-LAST:event_testInfoBtnActionPerformed

    private void personalinfoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalinfoBtn1ActionPerformed
        // TODO add your handling code here:
        TestInformationJPanel testInformationJPanel = new TestInformationJPanel(CardLayoutJPanel, this.lab);
        CardLayoutJPanel.add("TestInformationJPanel", testInformationJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_personalinfoBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppointmentsBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton personalinfoBtn;
    private javax.swing.JButton personalinfoBtn1;
    private javax.swing.JButton testInfoBtn;
    // End of variables declaration//GEN-END:variables
}
