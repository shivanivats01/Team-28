/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SearchFlights;

import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.FlightDirectory;
import Business.Seat;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jshar
 */
public class CustomerLogin extends javax.swing.JPanel {

    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerDirectory;
    private FlightDirectory flightDirectory;
    private CustomerDirectory customerDirectory;
    private Seat seat;
    
    /**
     * Creates new form CustomerLogin
     */
    public CustomerLogin(JPanel CardSequenceJPanel, AirlinerDirectory airlinerDirectory, FlightDirectory flightDirectory, CustomerDirectory customerDirectory,Seat seat ) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlinerDirectory = airlinerDirectory;
        this.flightDirectory = flightDirectory;
        this.customerDirectory = customerDirectory;
        this.seat = seat;
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
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Customer Login Page");

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnSignUp)
                        .addGap(103, 103, 103)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(629, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp)
                    .addComponent(btnLogin))
                .addContainerGap(429, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        LoginJPanel createPanel = new LoginJPanel(CardSequenceJPanel, airlinerDirectory, flightDirectory, customerDirectory, seat);
        CardSequenceJPanel.add("CreateAirlineJPanel", createPanel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SignUpJPanel createPanel = new SignUpJPanel(CardSequenceJPanel, customerDirectory);
        CardSequenceJPanel.add("CreateAirlineJPanel", createPanel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
        
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
