package UserInterface.HospitalAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import UserInterface.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riyamoitra
 */
public class HospitalWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Hospital hospital;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form HospitalWorkAreaJPanel
     */
    
    public HospitalWorkAreaJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {


        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account= account;
        this.business= business;
        
        this.hospital = (Hospital) this.account.getDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logOutBtn = new javax.swing.JButton();
        lblhospitalName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnManageDoctors = new javax.swing.JButton();
        btnManageHospitalInfo = new javax.swing.JButton();
        btnManageDepartments = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 17, 118, -1));

        lblhospitalName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblhospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhospitalName.setText("HOSPITAL");
        lblhospitalName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(lblhospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 17, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Work Area - Hospital Administrator");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 66, -1, -1));

        btnManageDoctors.setText("Manage Doctors");
        btnManageDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorsActionPerformed(evt);
            }
        });
        add(btnManageDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 157, 227, -1));

        btnManageHospitalInfo.setText("Manage Hospital Information");
        btnManageHospitalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalInfoActionPerformed(evt);
            }
        });
        add(btnManageHospitalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        btnManageDepartments.setText("Manage Departments");
        btnManageDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDepartmentsActionPerformed(evt);
            }
        });
        add(btnManageDepartments, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 251, 227, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorsActionPerformed
        // TODO add your handling code here:
        ManagePhysicianJPanel managePhysicianJPanel = new ManagePhysicianJPanel(CardLayoutJPanel, hospital, null, business);
        CardLayoutJPanel.add("managePhysicianJPanel", managePhysicianJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
        
        
    }//GEN-LAST:event_btnManageDoctorsActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(business);
        LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void btnManageDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDepartmentsActionPerformed
        // TODO add your handling code here:
        HospitalManageDepartmentJPanel hospitalManageDepartmentJPanel = new HospitalManageDepartmentJPanel(CardLayoutJPanel,account, business);
        CardLayoutJPanel.add("HospitalManageDepartmentJPanel", hospitalManageDepartmentJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_btnManageDepartmentsActionPerformed

    private void btnManageHospitalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalInfoActionPerformed
        // TODO add your handling code here:
        HospitalInfoJPanel hospitalInfoJPanel = new HospitalInfoJPanel(CardLayoutJPanel, account, business);
        CardLayoutJPanel.add("HospitalInfoJPanel", hospitalInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);

    }//GEN-LAST:event_btnManageHospitalInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDepartments;
    private javax.swing.JButton btnManageDoctors;
    private javax.swing.JButton btnManageHospitalInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblhospitalName;
    private javax.swing.JButton logOutBtn;
    // End of variables declaration//GEN-END:variables
}
