/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Patient.Patient;
import UserInterface.HospitalAdmin.HospitalInfoJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanivats
 */
public class SystemAdminHospitalPortalJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    
    /**
     * Creates new form SystemAdminHospitalPortalJPanel
     */
    public SystemAdminHospitalPortalJPanel(JPanel CardLayoutJPanel, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        
         populateTable();
    }

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Hospital> hospitalList = business.getHospitalDirectory().getHospitalList();
    
        int rowCount = hospitalTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)hospitalTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Hospital h : hospitalList) {
            Object row[] = new Object[6];
            row[0] = h;
            row[1] = h.getName();
            row[2] = h.getPhoneNo();
            row[3] = h.getAddress();
            row[4] = h.getAdminName();
            row[5] = h.getLicenseNo();
           
           
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewHospitalBtn = new javax.swing.JButton();
        createHospitalBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital id", "Contact Number", "Address", "Admin Name", "License Number"
            }
        ));
        jScrollPane1.setViewportView(hospitalTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 620, 131));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Hospital Portal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 22, -1, -1));

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 23, -1, -1));

        deleteBtn.setText("Delete Existing Hospital");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        viewHospitalBtn.setText("View Details");
        viewHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHospitalBtnActionPerformed(evt);
            }
        });
        add(viewHospitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        createHospitalBtn.setText("Sign up New Hospital");
        createHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHospitalBtnActionPerformed(evt);
            }
        });
        add(createHospitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = hospitalTable.getSelectedRow();
        Hospital selected = (Hospital) hospitalTable.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        HospitalDirectory hospitalDirectory = business.getHospitalDirectory();

        business.getHospitalDirectory().deleteHospital(selected.getHospitalId(), business);

        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHospitalBtnActionPerformed
        // TODO add your handling code here:

        int row = hospitalTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        System.out.println("=========== >> " + hospitalTable.getValueAt(row, 0));

        Hospital viewHospital = (Hospital) hospitalTable.getValueAt(row, 0);

        HospitalInfoJPanel hospitalInfoJPanel = new HospitalInfoJPanel(CardLayoutJPanel, viewHospital);
        CardLayoutJPanel.add("HospitalInfoJPanel", hospitalInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewHospitalBtnActionPerformed

    private void createHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHospitalBtnActionPerformed
        // TODO add your handling code here:
        CreateHospitalJPanel createHospitalJPanel = new CreateHospitalJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreateHospitalJPanel", createHospitalJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_createHospitalBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createHospitalBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewHospitalBtn;
    // End of variables declaration//GEN-END:variables
}
