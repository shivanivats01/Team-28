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
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<Patient>();
    // Customer customer1 = new Customer("C1", "Riya", "1234567890", "Boston");
      // customerDirectory.add(customer1);
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public void deleteCustomer(int index,Ecosystem system){
        String id = patientDirectory.get(index).getPatientID();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        patientDirectory.remove(index);
    }
    
    public Patient add(String name, String phone, String address){
        Patient patient1 = new Patient("P"+(patientDirectory.size()+1),name,phone,address);
        patientDirectory.add(patient1);
        return patient1;
    }
    
    public Patient getCustomerId(int index){
        return patientDirectory.get(index);
    }
    
    public void updateCustomer(String id,String name,String phone,String address){
        for(Patient patient: patientDirectory){
            if(patient.getPatientID().equalsIgnoreCase(id)){
                patient.setName(name);
                patient.setPhoneNo(phone);
                patient.setAddress(address);
            }
        }
    }
    
    public boolean isPhoneUnique(String phone){
        for(Patient patient: patientDirectory){
            if(patient.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public Patient getPatient(String id){
        for(Patient patient: patientDirectory){
            if(patient.getPatientID().equalsIgnoreCase(id)){
                return patient;
            }
        }
        return null;
    }
    
}
