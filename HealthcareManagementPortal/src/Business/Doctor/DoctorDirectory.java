/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Ecosystem;
import Business.Patient.Patient;
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
    public void deletePatient(int index,Ecosystem system){
        String id = doctorList.get(index).getDoctorId();
        
        for(int i =0; i < system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        
        doctorList.remove(index);
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
}
