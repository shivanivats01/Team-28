/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class LoginJPanel extends javax.swing.JPanel {
    
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private String role;

    /**
     * Creates new form LoginJPanel
     */
    /**
     * public SystemAdminLoginJPanel(JPanel CardLayoutJPanel) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
    }
*/
    public LoginJPanel(JPanel CardLayoutJPanel, Ecosystem business, String role) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.role = role;
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

        loginTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNametxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        passwordtxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1300, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTxt.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 21, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 170, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 170, -1));

        userNametxt.setBackground(new java.awt.Color(0, 153, 153));
        add(userNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 250, -1));

        loginBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginBtn.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 250, 40));

        passwordtxt.setBackground(new java.awt.Color(0, 153, 153));
        add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 250, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Welcome To Wecare");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 500, 100));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/—Pngtree—blockchain big data mobile phone_920097.jpg"))); // NOI18N
        add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1470, 940));
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        
        String userName = userNametxt.getText();
        String password = new String(passwordtxt.getPassword());
        
        UserAccount user = business.getUserAccountDirectory().authenticateUser(userName, password);
        
        if(user != null) {
           // System.out.println("Role: " + user.getRole().toString());
            
            CardLayoutJPanel.add("workarea", user.getRole().createWorkArea(CardLayoutJPanel, user, business));
            CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
            layout.next(CardLayoutJPanel);  
            
        } else {
           JOptionPane.showMessageDialog(null, "Please enter correct credentials");
           userNametxt.setText("");
           userNametxt.setText("");
        }


    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField userNametxt;
    // End of variables declaration//GEN-END:variables
}
