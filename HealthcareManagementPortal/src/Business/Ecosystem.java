/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Appointment.AppointmentSchedule;
import Business.Doctor.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class Ecosystem extends HealthCarePortal {
    
    private static Ecosystem business;
    
    // Already exists in HealthCarePortal
    // WorkQueue
    // Employee directory
    // User account directory
    
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private PatientDirectory patientDirectory = new PatientDirectory();
    private DoctorDirectory doctorDirectory = new DoctorDirectory();

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }
    
//    private AppointmentSchedule appointmentSchedule;

    // Making ecosystem singleton
    public static Ecosystem getInstance() {
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    

    public Ecosystem(HospitalDirectory hospitalDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory ) {
        this.hospitalDirectory = hospitalDirectory;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Ecosystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
