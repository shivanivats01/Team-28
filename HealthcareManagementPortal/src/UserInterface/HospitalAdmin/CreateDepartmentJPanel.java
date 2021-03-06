/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Department.Department;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.Role.DepartmentRole;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class CreateDepartmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDepartmentJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Hospital hospital;

    CreateDepartmentJPanel(JPanel CardLayoutJPanel, Ecosystem business, Hospital hospital) {

        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.business = business;
        this.hospital = hospital;
            
         
        //this.hospital = business.getHospitalDirectory().getHospital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adminTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Department Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 103, -1, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 98, 118, -1));

        jLabel6.setText("Department Admin Name: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 147, -1, -1));
        add(adminTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 142, 118, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add New Departments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 25, 286, 42));

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 51, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 295, -1, -1));
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 224, 118, -1));
        add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 186, 118, -1));

        jLabel7.setText("Username");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 191, -1, -1));

        jLabel8.setText("Password");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 229, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        Component[] componentArray = CardLayoutJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalManageDepartmentJPanel hospitalManageDepartmentJPanel = (HospitalManageDepartmentJPanel) component;
        hospitalManageDepartmentJPanel.populateTable();

        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        // TODO: add validations
        Department newDep = new Department();

        String depName= nameTxt.getText();     
        String adminName = adminTxt.getText();
        String username = userName.getText();
        String pswrd = password.getText();
        
      
        if(depName.isEmpty() || adminName.isEmpty() || username.isEmpty() || pswrd.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        }
        
        newDep.setDepartmentAdminName(adminName);
        newDep.setDepartmentName(depName);
        newDep.setHospital(hospital);
        newDep.setUsername(username);
        newDep.setPassword(pswrd);
        
        Department dep = hospital.addDepartment(newDep);
        UserAccount account = business.getUserAccountDirectory().createUserAccount(username, pswrd, dep.getDepartmentId(), new DepartmentRole(), dep);
        
        

        
        JOptionPane.showMessageDialog(null, "New Department added");
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
