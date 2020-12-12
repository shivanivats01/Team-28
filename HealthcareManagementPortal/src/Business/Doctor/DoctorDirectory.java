/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        doctorList = new ArrayList();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
 
    public Doctor add(Doctor d){
        d.setDoctorId("D"+(doctorList.size()+1));
                
        doctorList.add(d);
        return d;
    }
    public boolean isPhoneUnique(String phone){
        for(Doctor doctor: doctorList){
            if(doctor.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public void deleteDoctor(String doctorId, Ecosystem system){
        
        // Remove the doctor from doctorList
        for(Doctor d: doctorList) {
            if(d.getDoctorId().equals(doctorId)){
                doctorList.remove(d);
            }
        }
        
        // Remove doctor from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getEmployee().getName().equals(doctorId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
        
        // Remove doctor from employeeList
        for(Employee employee: system.getEmployeeDirectory().getEmployeeList()) {
            if(employee.getName().equals(doctorId)) {
                system.getEmployeeDirectory().getEmployeeList().remove(employee);
            }
        }
        
    }
    
    public void removeAllDoctors(Ecosystem system){
        
        // Remove all the doctors from doctorList
        for(Doctor d: doctorList) {
            deleteDoctor(d.getDoctorId(), system);
        }
        
        this.doctorList = new ArrayList();
        
    }
    
}
