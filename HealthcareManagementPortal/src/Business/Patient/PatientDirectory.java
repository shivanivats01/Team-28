/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientDirectory) {
        this.patientList = patientDirectory;
    }
    
    public void deletePatient(int index,Ecosystem system){
        String id = patientList.get(index).getPatientID();
        
        for(int i =0; i < system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        
        patientList.remove(index);
    }
    
    public Patient add(Patient p){
        p.setPatientID("P"+(patientList.size()+1));
                
        patientList.add(p);
        return p;
    }
    public boolean isPhoneUnique(String phone){
        for(Patient patient: patientList){
            if(patient.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    // TODO: Check if these methods are being used or not
    
//    public Patient getCustomerId(int index){
//        return patientList.get(index);
//    }
//    
//   public void updatePatient(String id,String name,String phone,String address){
//        for(Patient patient: patientList){
//            if(patient.getPatientID().equalsIgnoreCase(id)){
//                patient.setName(name);
//                patient.setPhoneNo(phone);
//                patient.setAddress(address);
//                patient.getEmailId();
//                patient.getAge();
//                patient.getBloodGroup();
//                patient.getGender();
//                 
//            }
//        }
//    }
//    
//    public boolean isPhoneUnique(String phone){
//        for(Patient patient: patientList){
//            if(patient.getPhoneNo().equalsIgnoreCase(phone)){
//                return false;
//            }
//        }
//        return true;
//    }
//    
//    public Patient getPatient(String id){
//        for(Patient patient: patientList){
//            if(patient.getPatientID().equalsIgnoreCase(id)){
//                return patient;
//            }
//        }
//        return null;
//    }
    
}
