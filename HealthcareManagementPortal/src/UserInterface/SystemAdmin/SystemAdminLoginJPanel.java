/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Appointment.AppointmentSchedule;
import Business.Doctor.DoctorDirectory;
import Business.Ecosystem;
import Business.Hospital.HospitalDirectory;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class SystemAdminLoginJPanel extends javax.swing.JPanel {
    
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Ecosystem business;
    private PatientDirectory patientDirectory;
    private HospitalDirectory hospitalDirectory;
    private DoctorDirectory doctorDirectory;
    private AppointmentSchedule appointmentSchedule;

    /**
     * Creates new form LoginJPanel
     */
    /**
     * public SystemAdminLoginJPanel(JPanel CardLayoutJPanel) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
    }
*/
    public SystemAdminLoginJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, PatientDirectory patientDirectory, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, AppointmentSchedule appointmentSchedule) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account=account;
        this.business = business;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory= doctorDirectory;
        this.hospitalDirectory=hospitalDirectory;
        this.appointmentSchedule = appointmentSchedule;
        
    
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNametxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        passwordtxt = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("System Admin Login");

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< Back");
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
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(loginBtn)
                    .addComponent(userNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(backBtn))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(loginBtn)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        String userName = userNametxt.getText();
       // Get Password
       char[] passwordCharArray = passwordtxt.getPassword();
       
       String password = String.valueOf(passwordCharArray);
       
       //Step1: Check in the system admin user account directory if you have the user
       UserAccount account=business.getUserAccountDirectory().authenticateUser(userName, password);
       //JOptionPane.showMessageDialog(null, "Username"+userAccount.getRole().toString());
       if(account != null){
          /**CardLayout layout=(CardLayout)CardLayoutJPanel.getLayout();
            CardLayoutJPanel.add("workArea",userAccount.getRole().createWorkArea(CardLayoutJPanel, account, business,patientDirectory,hospitalDirectory,doctorDirectory,appointmentSchedule));
            layout.next(CardLayoutJPanel);
            */
          
            SystemAdminPortalJPanel systemAdminPortalJPanel = new SystemAdminPortalJPanel(CardLayoutJPanel);
            CardLayoutJPanel.add("SystemAdminPortalJPanel", systemAdminPortalJPanel);
            CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
            layout.next(CardLayoutJPanel);
    }                                  
       
       else{
           JOptionPane.showMessageDialog(null, "Username or password incorrect. Please try again.");
       }
        
        // TODO: Add login validations
      /*  SystemAdminPortalJPanel systemAdminPortalJPanel = new SystemAdminPortalJPanel(CardLayoutJPanel);
        CardLayoutJPanel.add("SystemAdminPortalJPanel", systemAdminPortalJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
*/


    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField userNametxt;
    // End of variables declaration//GEN-END:variables
}
