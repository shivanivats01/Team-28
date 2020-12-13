/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Role.HospitalRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class Ecosystem extends HealthCarePortal {
    
    private static Ecosystem business;
    
    // TODO: Create a lab directory, pharmacy directory
    
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private PatientDirectory patientDirectory = new PatientDirectory();
    

    
    // Making ecosystem singleton
    public static Ecosystem getInstance() {
        if(business==null){
            business=new Ecosystem();
            
            prePopulateData();
        }
        return business;
    }
    
    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
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
    
    private static void prePopulateData() {
        // Create hospitals
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        
        h1.setAddress("h1 address");
        h1.setAdminName("h1 adminName");
        h1.setLicenseNo("h1 licenseNo");
        h1.setName("h1 name");
        h1.setPassword("h1");
        h1.setPhoneNo("h1 phoneNumber");
        h1.setUsername("h1");
        
        
        h2.setAddress("h2 address");
        h2.setAdminName("h2 adminName");
        h2.setLicenseNo("h2 licenseNo");
        h2.setName("h2 name");
        h2.setPassword("h2");
        h2.setPhoneNo("h2 phoneNumber");
        h2.setUsername("h2");
                
        
        Hospital hospital1 = business.getHospitalDirectory().addHospital(h1);
        UserAccount account1 = business.getUserAccountDirectory().createUserAccount(hospital1.getUsername(), hospital1.getPassword(), hospital1.getHospitalId(), new HospitalRole(), hospital1);
        
        Hospital hospital2 = business.getHospitalDirectory().addHospital(h2);
        UserAccount account2 = business.getUserAccountDirectory().createUserAccount(hospital2.getUsername(), hospital2.getPassword(), hospital2.getHospitalId(), new HospitalRole(), hospital2);


        // Create Patients
        Patient p1= new Patient();
        Patient p2 = new Patient();
        
        p1.setAddress("p1 address");
        p1.setAge("p1 age");
        p1.setBloodGroup("p1 bloodGroup");
        p1.setName("p1 name");
        p1.setPassword("p1");
        p1.setPhoneNo("p1 phoneNumber");
        p1.setUsername("p1");
        p1.setEmailId("p1 email");
        p1.setGender("p1 gender");
 
        p2.setAddress("p2 address");
        p2.setAge("p2 age");
        p2.setBloodGroup("p2 bloodGroup");
        p2.setName("p2 name");
        p2.setPassword("p2");
        p2.setPhoneNo("p2 phoneNumber");
        p2.setUsername("p2");
        p2.setEmailId("p2 email");
        p2.setGender("p2 gender");
                
        
        Patient patient1 = business.getPatientDirectory().addPatient(p1);
        UserAccount accountPatient1 = business.getUserAccountDirectory().createUserAccount(patient1.getUsername(), patient1.getPassword(), patient1.getPatientID(), new PatientRole(), patient1);

        
        Patient patient2 = business.getPatientDirectory().addPatient(p2);
        UserAccount accountPatient2 = business.getUserAccountDirectory().createUserAccount(patient2.getUsername(), patient2.getPassword(), patient2.getPatientID(), new PatientRole(), patient2);

    }
}
