/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import UserInterface.HospitalAdmin.*;
import UserInterface.SystemAdmin.SystemAdminPortalJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class PatientLoginJPanel extends javax.swing.JPanel {

     private JPanel CardLayoutJPanel;
    /**
     * Creates new form HospitalLoginJPanel
     */
    public PatientLoginJPanel(JPanel CardLayoutJPanel) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Patient/—Pngtree—blockchain big data mobile phone_920097.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1969, 800));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setRequestFocusEnabled(false);
        setSize(new java.awt.Dimension(1366, 768));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 360, 110, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Password:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 100, 30));
        add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 356, 230, 30));

        loginBtn.setBackground(new java.awt.Color(0, 204, 204));
        loginBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 240, 40));

        backBtn.setBackground(new java.awt.Color(0, 204, 204));
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setText("Patient Login");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 390, 230, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Patient/—Pngtree—blockchain big data mobile phone_920097.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1980, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        if(usernameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the username");
            return;
        }
        
        if(passwordTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the password");
            return;
        }
        
        
        
        PatientInfoJPanel patientInfoJPanel = new PatientInfoJPanel(CardLayoutJPanel, null);
        CardLayoutJPanel.add("PatientInfoJPanel", patientInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
       
    }//GEN-LAST:event_loginBtnActionPerformed

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
