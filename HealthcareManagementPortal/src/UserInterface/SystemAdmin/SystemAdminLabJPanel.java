/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Lab.Lab;
import Business.Lab.LabDirectory;
import UserInterface.Lab.CreateLabJPanel;
import UserInterface.Lab.LabInfoJpanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UserInterface.Lab.LabInfoJpanel;

/**
 *
 * @author riyamoitra
 */



public class SystemAdminLabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminLabJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;

    SystemAdminLabJPanel(JPanel CardLayoutJPanel, Ecosystem business) {

         initComponents();
         
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;

    }
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Lab> labList = business.getLabDirectory().getLabList();
    
        int rowCount = labTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)labTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Lab l : labList) {
            Object row[] = new Object[5];
            row[0] = l;
            row[1] = l.getLabname();
            row[2] = l.getPhoneNo();
            row[3] = l.getAddress();
            row[4] = l.getEmailId();
          
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

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        createLabBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewHospitalBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Lab Portal");

        labTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lab Id", "Lab name", "Contact Number", "Address", "Email"
            }
        ));
        jScrollPane1.setViewportView(labTable);

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        createLabBtn.setText("Sign up New Lab");
        createLabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete Existing Lab");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewHospitalBtn.setText("View Details");
        viewHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHospitalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createLabBtn)
                        .addGap(115, 438, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewHospitalBtn)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn)
                    .addComponent(viewHospitalBtn))
                .addGap(18, 18, 18)
                .addComponent(createLabBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void createLabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLabBtnActionPerformed
        // TODO add your handling code here:
        CreateLabJPanel createLabJPanel = new CreateLabJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreateLabJPanel", createLabJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createLabBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = labTable.getSelectedRow();
        Lab selected = (Lab) labTable.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LabDirectory labDirectory = business.getLabDirectory();

        business.getLabDirectory().deleteLab(selected.getLabID(), business);

        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHospitalBtnActionPerformed
        // TODO add your handling code here:

        int row = labTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //System.out.println("=========== >> " + labTable.getValueAt(row, 0));

        Lab viewLab = (Lab) labTable.getValueAt(row, 0);

        LabInfo1Jpanel labInfo1JPanel = new LabInfo1Jpanel(CardLayoutJPanel, viewLab);
        CardLayoutJPanel.add("LabInfo1JPanel", labInfo1JPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewHospitalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createLabBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewHospitalBtn;
    // End of variables declaration//GEN-END:variables
}