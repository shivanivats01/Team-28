/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ambulance.Ambulance;
import Business.Ambulance.AmbulanceFleet;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import UserInterface.Ambulance.AmbulanceInfoJPanel;
import UserInterface.Ambulance.CreateAmbulanceJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riyamoitra
 */


public class SystemAdminAmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminAmbulanceJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    

    SystemAdminAmbulanceJPanel(JPanel CardLayoutJPanel, Ecosystem business) {

        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;

    }
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Ambulance> ambulanceList = business.getAmbulancefleet().getAmbulanceFleet();
    
        int rowCount = ambulanceTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)ambulanceTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Ambulance amb : ambulanceList) {
            Object row[] = new Object[5];
            row[0] = amb;
            row[1] = amb.getDriverName();
            row[2] = amb.getPhoneNo();
            row[3] = amb.getBaseLocation();
            row[4] = amb.getLicenseNo();
           
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
        ambulanceTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        createAmbulanceBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewAmbulanceBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Ambulance Portal");

        ambulanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ambulance Id", "Driver Name", "Contact Number", "Base Location", "License Number"
            }
        ));
        jScrollPane1.setViewportView(ambulanceTable);

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        createAmbulanceBtn.setText("Add New Ambulance");
        createAmbulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAmbulanceBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete Existing Ambulance");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewAmbulanceBtn.setText("View Details");
        viewAmbulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAmbulanceBtnActionPerformed(evt);
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
                        .addComponent(createAmbulanceBtn)
                        .addGap(115, 456, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(refreshBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewAmbulanceBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backBtn)
                                    .addGap(108, 108, 108)
                                    .addComponent(jLabel1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn)
                    .addComponent(viewAmbulanceBtn))
                .addGap(18, 18, 18)
                .addComponent(createAmbulanceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn)
                .addContainerGap(102, Short.MAX_VALUE))
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

    private void createAmbulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAmbulanceBtnActionPerformed
        // TODO add your handling code here:
        CreateAmbulanceJPanel createAmbulanceJPanel = new CreateAmbulanceJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreateAmbulanceJPanel", createAmbulanceJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createAmbulanceBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = ambulanceTable.getSelectedRow();
        Ambulance selectedAmb = (Ambulance) ambulanceTable.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        AmbulanceFleet ambulanceFleet = business.getAmbulancefleet();
        
        business.getAmbulancefleet().deleteAmbulance(selectedAmb.getAmbulanceId(), business);

        
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewAmbulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAmbulanceBtnActionPerformed
        // TODO add your handling code here:

        int row = ambulanceTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        System.out.println("=========== >> " + ambulanceTable.getValueAt(row, 0));

        Ambulance viewAmbulance = (Ambulance) ambulanceTable.getValueAt(row, 0);

        AmbulanceInfoJPanel ambulanceInfoJPanel = new AmbulanceInfoJPanel(CardLayoutJPanel, viewAmbulance);
        CardLayoutJPanel.add("AmbulanceInfoJPanel", ambulanceInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewAmbulanceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ambulanceTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createAmbulanceBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewAmbulanceBtn;
    // End of variables declaration//GEN-END:variables
}
