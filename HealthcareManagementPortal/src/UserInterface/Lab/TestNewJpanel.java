/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.Doctor.Doctor;
import Business.Lab.Lab;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestRequest;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class TestNewJpanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    LabTestRequest request;
    UserAccount account;
    
    JFileChooser chooser;
    File file;
    BufferedImage img;

    /**
     * Creates new form TestNewJpanel
     */
    public TestNewJpanel(JPanel CardLayoutJPanel, LabTestRequest request, UserAccount account) {
        initComponents();
        
            
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.request = request;
        this.account = account;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        choosebtn = new javax.swing.JButton();
        completeTRbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 23, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Upload Test Result");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 38, -1, 58));

        jLabel1.setText("Upload Result: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 156, 116, 30));

        choosebtn.setText("Choose");
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });
        add(choosebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 158, -1, -1));

        completeTRbtn.setText("Complete Test Request");
        completeTRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeTRbtnActionPerformed(evt);
            }
        });
        add(completeTRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 237, -1, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);

    }//GEN-LAST:event_backBtnActionPerformed

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        // TODO add your handling code here:

        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        try{
            img = ImageIO.read(file);
        } catch (IOException e){
        }
    }//GEN-LAST:event_choosebtnActionPerformed

    private void completeTRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeTRbtnActionPerformed
        // TODO add your handling code here:

        request.setResolveDate(new Date());

        Doctor doctor = (Doctor) request.getSender().getDetails();
        Lab lab = (Lab) account.getDetails();

        this.request.setStatus("lab test completed");
        this.request.setImage(img);

        JOptionPane.showMessageDialog(null, "Test Completed");

    }//GEN-LAST:event_completeTRbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton choosebtn;
    private javax.swing.JButton completeTRbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
