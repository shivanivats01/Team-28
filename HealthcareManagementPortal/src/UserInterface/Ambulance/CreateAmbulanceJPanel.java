/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Ambulance;

import Business.Ambulance.Ambulance;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.Role.AmbulanceRole;
import Business.Role.HospitalRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class CreateAmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAmbulanceJPanel
     */
    JPanel CardLayoutJPanel;
    Ecosystem business;
    Ambulance ambulance;
    
    

    public CreateAmbulanceJPanel(JPanel CardLayoutJPanel, Ecosystem business) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drivernameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        baseLocationTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        licenseTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Sign Up Ambulance");

        jLabel2.setText("Driver Name:");

        jLabel6.setText("Contact number:");

        jLabel4.setText("Base Location:");

        baseLocationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseLocationTxtActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("UserName:");

        jLabel8.setText("Passowrd:");

        jLabel7.setText("License Number:");

        licenseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(drivernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(numberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(baseLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(saveBtn)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(licenseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drivernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(baseLocationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(licenseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveBtn)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void baseLocationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseLocationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseLocationTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

      Ambulance newAmbulance = new Ambulance();
      
        
        String username = usernameTxt.getText();
        String password= passwordTxt.getText();
        
     
     String phoneNo= numberTxt.getText();
     String baseLocation = baseLocationTxt.getText();
     String driverName = drivernameTxt.getText();
     String licenseNo= licenseTxt.getText();
     
     newAmbulance.setDriverName(driverName);
     newAmbulance.setBaseLocation(baseLocation);
    
     newAmbulance.setLicenseNo(licenseNo);
     newAmbulance.setUsername(username);
     newAmbulance.setPassword(password);
     newAmbulance.setPhoneNo(phoneNo);
       if( phoneNo.isEmpty() || baseLocation.isEmpty()|| username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!phoneFormat(phoneNo))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }
        else if(!business.getPatientDirectory().isPhoneUnique(phoneNo)){
            JOptionPane.showMessageDialog(null, "Phone No already registered!");
        }
        else if(!business.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
       else{
            Ambulance ambulance = business.getAmbulancefleet().add(newAmbulance);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(username, password, ambulance.getAmbulanceId(), new AmbulanceRole(), ambulance);
        
            JOptionPane.showMessageDialog(null, "New Ambulance added");
        }
    }
    
        public boolean phoneFormat(String phoneNo){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phoneNo);
        if(matcher.matches()){
            return true;
        }
        return false;
    
                                           

        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void licenseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField baseLocationTxt;
    private javax.swing.JTextField drivernameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField licenseTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
