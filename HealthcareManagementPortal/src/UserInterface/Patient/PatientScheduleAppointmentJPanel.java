/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Department.Department;
import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riyamoitra
 */
public class PatientScheduleAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPageOneJPanel
     */
    
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Ecosystem business;
    
    

    public PatientScheduleAppointmentJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account=account;
        this.business = business;
        
        populateHopitalComboBox();

    }
    
    public void populateHopitalComboBox() {
        
        ArrayList<Hospital> hospitalList = business.getHospitalDirectory().getHospitalList();
        Hospital[] comboBoxModel1 = hospitalList.toArray(new Hospital[0]);
        
        
        hospitalNameComboBox.setModel(new DefaultComboBoxModel<Hospital>(comboBoxModel1));
        
    }
    
    public void populateTable(ArrayList<WorkRequest> appointments) {
        // populate all patients in patient directory
        
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(WorkRequest r: appointments) {
            Object row[] = new Object[8];
            row[0] = r;
            row[1] = r.getSender().getId();
            row[2] = r.getReceiver().getId();
            row[3] = r.getStatus();
            row[4] = r.getRequestDate();
            row[5] = r.getResolveDate();
            row[6] = r.getMessage();
            row[7] = r.getTime();
            
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

        physicianNameCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        searchByHospitalName = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hospitalNameComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        departmentlNameCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        physicianNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicianNameComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Hospital: ");

        searchByHospitalName.setText("Get available time slots");
        searchByHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByHospitalNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Physician");

        hospitalNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Department: ");

        departmentlNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentlNameComboActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Sender", "Reciever", "Status", "Request Date", "Resolve Date", "Message", "Time Slot"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Date");

        jButton1.setText("Book Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(24, 24, 24)
                                            .addComponent(physicianNameCombo, 0, 78, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(hospitalNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(departmentlNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(searchByHospitalName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentlNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(physicianNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(searchByHospitalName)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void physicianNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicianNameComboActionPerformed

    }//GEN-LAST:event_physicianNameComboActionPerformed

    private void searchByHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByHospitalNameActionPerformed
        // TODO add your handling code here:
        
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        Department selectedDept = (Department) departmentlNameCombo.getSelectedItem();
        Doctor selectedDoctor = (Doctor) physicianNameCombo.getSelectedItem();
        Date selectedDate = jDateChooser1.getDate();
               
        if(selectedHospital == null || selectedDept == null || selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Please select the hospital, departmnent and date");
            return;
        }
        
        ArrayList<WorkRequest> availableWorkRequests = new ArrayList();
        // When only hospital and department are selected
        if(selectedDoctor == null) {
            
            // Each doctor 
            for(int i = 0; i < selectedDept.getDoctorDirectory().size(); i ++) {
                UserAccount doctorAccount = business.getUserAccountDirectory().getUserById(selectedDoctor.getDoctorId());
                ArrayList<WorkRequest> doctorWorkRequestList = doctorAccount.getWorkQueue().getWorkRequestList();
            
                if(doctorWorkRequestList.size() == 0) {
                    for(int time = 8; time < 19; time ++) {
                        WorkRequest newRequest = new WorkRequest();

                        newRequest.setReceiver(doctorAccount);
                        newRequest.setRequestDate(new Date());
                        newRequest.setSender(account);
                        newRequest.setStatus("available");
                        newRequest.setTime(selectedDate.toString()+ " [ " + time + " ] ");

                        availableWorkRequests.add(newRequest);
                    }
                } else {
                    for(int time = 8; time < 19; time ++) {
                        WorkRequest newRequest = new WorkRequest();

                        newRequest.setReceiver(doctorAccount);
                        newRequest.setRequestDate(new Date());
                        newRequest.setSender(account);
                        newRequest.setStatus("available");
                        newRequest.setTime(selectedDate.toString() + " [ " + time + " ] ");

                        for(WorkRequest w : doctorWorkRequestList) {
                            if(!w.getTime().equals(selectedDate.toString() + " [ " + time + " ] ")) {
                                availableWorkRequests.add(newRequest);
                            }
                        }
                    }
                }
            } 
        } else {
            
            UserAccount doctorAccount = business.getUserAccountDirectory().getUserById(selectedDoctor.getDoctorId());
            ArrayList<WorkRequest> doctorWorkRequestList = doctorAccount.getWorkQueue().getWorkRequestList();
            
            if(doctorWorkRequestList.size() == 0) {
                for(int time = 8; time < 19; time ++) {
                    WorkRequest newRequest = new WorkRequest();
                            
                    newRequest.setReceiver(doctorAccount);
                    newRequest.setRequestDate(new Date());
                    newRequest.setSender(account);
                    newRequest.setStatus("available");
                    newRequest.setTime(selectedDate.toString() + " [ " + time + " ] ");

                    availableWorkRequests.add(newRequest);
                }
            } else {
                for(int time = 8; time < 19; time ++) {
                    WorkRequest newRequest = new WorkRequest();
                            
                    newRequest.setReceiver(doctorAccount);
                    newRequest.setRequestDate(new Date());
                    newRequest.setSender(account);
                    newRequest.setStatus("available");
                    newRequest.setTime(selectedDate.toString() + " [ " + time + " ] ");
                    
                    for(WorkRequest w : doctorWorkRequestList) {
                        if(!w.getTime().equals(selectedDate.toString() + " [ " + time + " ] ")) {
                            availableWorkRequests.add(newRequest);
                        }
                    }
                }
            }
            
        }
                   
        System.out.println("================ >>> " + availableWorkRequests.size());
        
        populateTable(availableWorkRequests);
        

    }//GEN-LAST:event_searchByHospitalNameActionPerformed

    private void hospitalNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameComboBoxActionPerformed
        // TODO add your handling code here:
        
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        
        ArrayList<Department> deptList = selectedHospital.getDepartmentDirectory();
        Department[] comboBoxModel = deptList.toArray(new Department[0]);
       
        departmentlNameCombo.setModel(new DefaultComboBoxModel<Department>(comboBoxModel));
     
    }//GEN-LAST:event_hospitalNameComboBoxActionPerformed

    private void departmentlNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentlNameComboActionPerformed
        // TODO add your handling code here:
        
        Department selectedDept = (Department) departmentlNameCombo.getSelectedItem();
        
        ArrayList<Doctor> doctorList = selectedDept.getDoctorDirectory();
        Doctor[] comboBoxModel2 = doctorList.toArray(new Doctor[0]);
        
        physicianNameCombo.setModel(new DefaultComboBoxModel<Doctor>(comboBoxModel2));
        
        
    }//GEN-LAST:event_departmentlNameComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest workRequest = (WorkRequest) jTable1.getValueAt(selectedRow, 0);
        
        UserAccount doctorAccount = workRequest.getReceiver();
        
        workRequest.setStatus("awaiting approval");
        
        doctorAccount.getWorkQueue().getWorkRequestList().add(workRequest);
        this.account.getWorkQueue().getWorkRequestList().add(workRequest);
        
        JOptionPane.showMessageDialog(null, "Appointment sent for approval to physician");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<Department> departmentlNameCombo;
    private javax.swing.JComboBox<Hospital> hospitalNameComboBox;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Doctor> physicianNameCombo;
    private javax.swing.JButton searchByHospitalName;
    // End of variables declaration//GEN-END:variables
}
