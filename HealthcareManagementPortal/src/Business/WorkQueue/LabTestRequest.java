/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author riyamoitra
 */
public class LabTestRequest extends WorkRequest {
    
     private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
}
