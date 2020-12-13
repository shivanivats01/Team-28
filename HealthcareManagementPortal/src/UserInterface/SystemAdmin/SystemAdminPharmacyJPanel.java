/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import UserInterface.Pharmacy.PharmacyInfoJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanivats
 */
public class SystemAdminPharmacyJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    private Ecosystem business;
    /**
     * Creates new form SystemAdminPharmacyJPanel
     */
    public SystemAdminPharmacyJPanel(JPanel CardLayoutJPanel,  Ecosystem business) {
        
    
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
         
        populateTable();
    }
    
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Pharmacy> pharmacyList = business.getPharmacyDirectory().getPharmacyList();
    
        int rowCount = pharmacyTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)pharmacyTbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Pharmacy p : pharmacyList) {
            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getName();
            row[2] = p.getLicenseNo();
            row[3] = p.getPhoneNo();
            row[4] = p.getEmailId();
            row[5] = p.getAddress();
           
           
            
            model.addRow(row);
        }
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTbl = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        viewPharmacyBtn = new javax.swing.JButton();
        createPharmacyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Pharmacy Portal");

        pharmacyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Pharmacy Id", "Name", "License No.", "phone no.", "email id", "Address"
            }
        ));
        jScrollPane1.setViewportView(pharmacyTbl);

        deleteBtn.setText("Delete Existing Pharmacy");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewPharmacyBtn.setText("View Details");
        viewPharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPharmacyBtnActionPerformed(evt);
            }
        });

        createPharmacyBtn.setText("Sign Up New Pharmacy");
        createPharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPharmacyBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addComponent(deleteBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createPharmacyBtn)
                        .addGap(59, 59, 59)
                        .addComponent(viewPharmacyBtn)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPharmacyBtn)
                    .addComponent(createPharmacyBtn))
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = pharmacyTbl.getSelectedRow();
        Pharmacy selectedPharmacy = (Pharmacy) pharmacyTbl.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        PharmacyDirectory pharmacyDirectory = business.getPharmacyDirectory();

        business.getPharmacyDirectory().deletePharmacy(selectedPharmacy.getPharmacyId(), business);

        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewPharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPharmacyBtnActionPerformed
        // TODO add your handling code here:

        int row = pharmacyTbl.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        System.out.println("=========== >> " + pharmacyTbl.getValueAt(row, 0));

        Pharmacy viewPharmacy = (Pharmacy) pharmacyTbl.getValueAt(row, 0);

        PharmacyInfoJPanel pharmacyInfoJPanel = new PharmacyInfoJPanel(CardLayoutJPanel, viewPharmacy);
        CardLayoutJPanel.add("PharmacyInfoJPanel", pharmacyInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewPharmacyBtnActionPerformed

    private void createPharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPharmacyBtnActionPerformed
        // TODO add your handling code here:
        CreatePharmacyJPanel createPharmacyJPanel = new CreatePharmacyJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreatePharmacyJPanel", createPharmacyJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createPharmacyBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createPharmacyBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyTbl;
    private javax.swing.JButton viewPharmacyBtn;
    // End of variables declaration//GEN-END:variables
}
