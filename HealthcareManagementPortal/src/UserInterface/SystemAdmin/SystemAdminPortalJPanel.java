/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class SystemAdminPortalJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;

    /**
     * Creates new form SystemAdminPortalJPanel
     */
    public SystemAdminPortalJPanel(JPanel CardLayoutJPanel) {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        patientPortalBtn = new javax.swing.JButton();
        hospitalPortalBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        patientPortalBtn.setBackground(new java.awt.Color(255, 255, 255));
        patientPortalBtn.setText("Patient Portal");
        patientPortalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientPortalBtnActionPerformed(evt);
            }
        });

        hospitalPortalBtn.setBackground(new java.awt.Color(255, 255, 255));
        hospitalPortalBtn.setText("Hospital Portal");
        hospitalPortalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalPortalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(hospitalPortalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientPortalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(patientPortalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hospitalPortalBtn)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientPortalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientPortalBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminPatientPortalJPanel systemAdminPatientPortalJPanel = new SystemAdminPatientPortalJPanel(CardLayoutJPanel);
        CardLayoutJPanel.add("SystemAdminPatientPortalJPanel", systemAdminPatientPortalJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_patientPortalBtnActionPerformed

    private void hospitalPortalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalPortalBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminHospitalPortalJPanel systemAdminHospitalPortalJPanel = new SystemAdminHospitalPortalJPanel(CardLayoutJPanel);
        CardLayoutJPanel.add("SystemAdminHospitalPortalJPanel", systemAdminHospitalPortalJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_hospitalPortalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hospitalPortalBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton patientPortalBtn;
    // End of variables declaration//GEN-END:variables
}