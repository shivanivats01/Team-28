/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import UserInterface.Patient.*;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import UserInterface.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import UserInterface.Patient.PatientInfoJPanel;

/**
 *
 * @author shivanivats
 */
public class WelcomePhysicianJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Doctor doctor;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form WelcomePatientJPanel
     */
    public WelcomePhysicianJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.doctor = (Doctor) account.getDetails();
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
        searchPatientBtn = new javax.swing.JButton();
        personalinfoBtn = new javax.swing.JButton();
        AppointmentsBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        createPrescription = new javax.swing.JButton();
        requestLabTestbtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Welcome To WeCare");

        searchPatientBtn.setText("Search Patient History");
        searchPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientBtnActionPerformed(evt);
            }
        });

        personalinfoBtn.setText("Personal Information");
        personalinfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalinfoBtnActionPerformed(evt);
            }
        });

        AppointmentsBtn.setText("Appointments");
        AppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Navigate to:");

        createPrescription.setText("Create Prescriptions");
        createPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrescriptionActionPerformed(evt);
            }
        });

        requestLabTestbtn.setText("Request Lab Test");
        requestLabTestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestLabTestbtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personalinfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestLabTestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(logOutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(searchPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalinfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestLabTestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsBtnActionPerformed
        // TODO add your handling code here:
        
        PhysicianAppointmentsJPanel physicianAppointmentsJPanel = new PhysicianAppointmentsJPanel(CardLayoutJPanel, account, business);
        CardLayoutJPanel.add("PhysicianAppointmentsJPanel", physicianAppointmentsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_AppointmentsBtnActionPerformed

    private void personalinfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalinfoBtnActionPerformed
        // TODO add your handling code here:
        
        PhysicianInfoJPanel physicianInfoJPanel = new PhysicianInfoJPanel(CardLayoutJPanel, this.doctor);
        CardLayoutJPanel.add("PhysicianInfoJPanel", physicianInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_personalinfoBtnActionPerformed

    private void searchPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientBtnActionPerformed
        // TODO add your handling code here:
        
        SearchPatientJPanel searchPatientJPanel = new SearchPatientJPanel(CardLayoutJPanel, this.doctor, this.account, business);
        CardLayoutJPanel.add("SearchPatientJPanel", searchPatientJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_searchPatientBtnActionPerformed

    private void createPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPrescriptionActionPerformed
        // TODO add your handling code here:
        CreatePrescriptionJPanel createPrescriptionJPanel = new CreatePrescriptionJPanel( CardLayoutJPanel,account, business, this.doctor);
        CardLayoutJPanel.add("CreatePrescriptionJPanel", createPrescriptionJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_createPrescriptionActionPerformed

    private void requestLabTestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestLabTestbtnActionPerformed
        // TODO add your handling code here:
        
        CreateLabTestRequestJPanel createLabTestRequestJPanel = new CreateLabTestRequestJPanel( CardLayoutJPanel,account, business, this.doctor);
        CardLayoutJPanel.add("CreateLabTestRequestJPanel", createLabTestRequestJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_requestLabTestbtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(business);
        LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);

    }//GEN-LAST:event_logOutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppointmentsBtn;
    private javax.swing.JButton createPrescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton personalinfoBtn;
    private javax.swing.JButton requestLabTestbtn;
    private javax.swing.JButton searchPatientBtn;
    // End of variables declaration//GEN-END:variables
}
