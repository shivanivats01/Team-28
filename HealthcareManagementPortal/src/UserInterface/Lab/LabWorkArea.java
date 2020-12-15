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
        AppointmentsBtn = new javax.swing.JButton();
        personalinfoBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        testInfoBtn = new javax.swing.JButton();
        personalinfoBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 46, 562, 46));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Navigate to:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 98, -1, 26));

        AppointmentsBtn.setText("Test Requests");
        AppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsBtnActionPerformed(evt);
            }
        });
        add(AppointmentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 204, 224, 38));

        personalinfoBtn.setText("Lab Information");
        personalinfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalinfoBtnActionPerformed(evt);
            }
        });
        add(personalinfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 260, 224, 38));

        logOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 230, 40));

        testInfoBtn.setText("Test Information");
        testInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testInfoBtnActionPerformed(evt);
            }
        });
        add(testInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        personalinfoBtn1.setText("Manage Tests");
        personalinfoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalinfoBtn1ActionPerformed(evt);
            }
        });
        add(personalinfoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 316, 224, 38));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton personalinfoBtn;
    private javax.swing.JButton personalinfoBtn1;
    private javax.swing.JButton testInfoBtn;
    // End of variables declaration//GEN-END:variables
}
