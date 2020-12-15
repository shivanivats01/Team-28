/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Ambulance.AmbulanceFleet;
import Business.Department.Department;
import Business.Doctor.Doctor;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Lab.Lab;
import Business.Lab.LabDirectory;
import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.Pharmacy.Pharmacy;
import Business.Patient.PatientDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.DepartmentRole;
import Business.Role.HospitalRole;
import Business.Role.PatientRole;
import Business.Role.PharmacyRole;
import Business.Role.PhysicianRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author riyamoitra
 */
public class Ecosystem extends HealthCarePortal {
    
    private static Ecosystem business;
    
    // TODO: Create a lab directory, pharmacy directory
    
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private PatientDirectory patientDirectory = new PatientDirectory();
    private PharmacyDirectory pharmacyDirectory = new PharmacyDirectory();
    private LabDirectory labDirectory = new LabDirectory();
    private AmbulanceFleet ambulancefleet = new AmbulanceFleet();

    public LabDirectory getLabDirectory() {
        return labDirectory;
    }

    public void setLabDirectory(LabDirectory labDirectory) {
        this.labDirectory = labDirectory;
    }

    public AmbulanceFleet getAmbulancefleet() {
        return ambulancefleet;
    }

    public void setAmbulancefleet(AmbulanceFleet ambulancefleet) {
        this.ambulancefleet = ambulancefleet;
    }

    // Making ecosystem singleton
    public static Ecosystem getInstance() {
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    
    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
   
    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private Ecosystem(){
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName){
       return false;
    }

}
