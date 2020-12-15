/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Lab.Lab;
import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestRequest;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Patient.PatientDetailsJPanel;
import UserInterface.Pharmacy.PastPrescriptionsJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riyamoitra
 */
public class PendingTestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PendingTestsJPanel
     */
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;

    PendingTestsJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {

          initComponents();

          
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.account=account;
        this.business= business;
        
        this.populateTable();
    }

    public void populateTable() {
        
        
        // populate all patients in patient directory
        ArrayList<WorkRequest> testList = account.getWorkQueue().getWorkRequestList();
        ArrayList<LabTestRequest> upcomingTestList = new ArrayList();
        
        for(WorkRequest w: testList) {
            
            LabTestRequest pr = (LabTestRequest) w;            
            if(w.getStatus().equals("pending lab approval")) {
                upcomingTestList.add(pr);
            }
        }
        
    
        int rowCount = pendingTestTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)pendingTestTbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(LabTestRequest w: upcomingTestList) {
            Object row[] = new Object[4];
        
            
            row[0] = w.getSender().getId();
            row[1] = w.getPatient().getPatientID();
            row[2] = w.getStatus();
            row[3] = w;
           
            
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

        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pendingTestTbl = new javax.swing.JTable();
        DeleteTestbtn = new javax.swing.JButton();
        ProcessTestbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Pending Tests");

        pendingTestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor", "Patient", "Status", "Date Requested"
            }
        ));
        jScrollPane4.setViewportView(pendingTestTbl);

        DeleteTestbtn.setText("Delete an Test");
        DeleteTestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTestbtnActionPerformed(evt);
            }
        });

        ProcessTestbtn.setText("Process Test Request");
        ProcessTestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessTestbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel4)
                .addGap(0, 332, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DeleteTestbtn)
                        .addGap(18, 18, 18)
                        .addComponent(ProcessTestbtn)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProcessTestbtn)
                    .addComponent(DeleteTestbtn))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteTestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTestbtnActionPerformed
        // TODO add your handling code here:

        int rowCount = pendingTestTbl.getSelectedRow();

        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        WorkRequest request = (WorkRequest) pendingTestTbl.getValueAt(rowCount, 4);
        request.setStatus("lab test canceled");

        // delete from patient work queue
        this.account.getWorkQueue().getWorkRequestList().remove(request);

        // delete from physician work queue
        request.getReceiver().getWorkQueue().getWorkRequestList().remove(request);

        JOptionPane.showMessageDialog(null, "Test deleted");

    }//GEN-LAST:event_DeleteTestbtnActionPerformed

    private void ProcessTestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessTestbtnActionPerformed
        // TODO add your handling code here:
         
        int rowCount = pendingTestTbl.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        LabTestRequest request = (LabTestRequest) pendingTestTbl.getValueAt(rowCount, 3);
        request.setStatus("lab request in-progress");
        
        populateTable();
        
        TestNewJpanel testResultJPanel = new TestNewJpanel(CardLayoutJPanel,request, this.account);
        CardLayoutJPanel.add("TestNewJpanel", testResultJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
        
    }//GEN-LAST:event_ProcessTestbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteTestbtn;
    private javax.swing.JButton ProcessTestbtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable pendingTestTbl;
    // End of variables declaration//GEN-END:variables
}
