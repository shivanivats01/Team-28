/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public PatientDirectory() {
        patientList = new ArrayList();
    }
    public void removePatient(Patient p){
        patientList.remove(p);
    }
    
}
