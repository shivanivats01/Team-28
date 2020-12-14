/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Department.Department;
import Business.Doctor.Doctor;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
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

        // Create department
        Department d1 = new Department();
        d1.setDepartmentAdminName("d1 admin name");
        d1.setDepartmentName("d1 name");
        d1.setUsername("d1");
        d1.setPassword("d1");
        d1.setHospital(hospital1);
        
        Department department = hospital1.addDepartment(d1);
        business.getUserAccountDirectory().createUserAccount(department.getUsername(), department.getPassword(), department.getDepartmentId(), new DepartmentRole(), department);

        
        
        // Create physician
        Doctor doc1 = new Doctor();
        doc1.setDepartment(department);
        doc1.setEmailId("doc1 email");
        doc1.setGender("doc1 gender");
        doc1.setLicenseNo("doc1 licenseNo");
        doc1.setName("doc1 name");
        doc1.setPassword("doc1");
        doc1.setUsername("doc1");
        doc1.setPhoneNo("doc1 phoneNo");
        
        Doctor doctor = department.addDoctor(doc1);
        business.getUserAccountDirectory().createUserAccount(doctor.getUsername(), doctor.getPassword(), doctor.getDoctorId(), new PhysicianRole(), doctor);
        
        

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
//        ArrayList<PatientDetails> l1 = new ArrayList();
//        l1.add(new PatientDetails(null, new Date(), "Headaches can have causes that aren't due to underlying disease. Examples include lack of sleep, an incorrect eyeglass prescription, stress, loud noise exposure, or tight headwear."));
//        patient1.setPatientDetails(l1);
        
        Patient patient2 = business.getPatientDirectory().addPatient(p2);
        UserAccount accountPatient2 = business.getUserAccountDirectory().createUserAccount(patient2.getUsername(), patient2.getPassword(), patient2.getPatientID(), new PatientRole(), patient2);
//        ArrayList<PatientDetails> l2 = new ArrayList();
//        l2.add(new PatientDetails(null, new Date(), "Back pain is one of the most common reasons people go to the doctor or miss work, and it is a leading cause of disability worldwide."));
//        patient2.setPatientDetails(l2);
        
         // Create pharmacy
        Pharmacy ph1 = new Pharmacy();
        Pharmacy ph2 = new Pharmacy();
        
        ph1.setAddress("ph1 address");
        ph1.setEmailId("ph1 emailId");
        ph1.setLicenseNo("ph1 licenseNo");
        ph1.setName("ph1 name");
        ph1.setPassword("ph1");
        ph1.setPhoneNo("ph1 phoneNumber");
        ph1.setUsername("ph1");
        
        
        ph2.setAddress("ph2 address");
        ph2.setEmailId("ph2 adminName");
        ph2.setLicenseNo("ph2 licenseNo");
        ph2.setName("ph2 name");
        ph2.setPassword("ph2");
        ph2.setPhoneNo("ph2 phoneNumber");
        ph2.setUsername("ph2");
                
        
        Pharmacy pharmacy1 = business.getPharmacyDirectory().addPharmacy(ph1);
        UserAccount accountPharmacy1 = business.getUserAccountDirectory().createUserAccount(pharmacy1.getUsername(), pharmacy1.getPassword(), pharmacy1.getPharmacyId(), new PharmacyRole(), pharmacy1);
        
        Pharmacy pharmacy2 = business.getPharmacyDirectory().addPharmacy(ph2);
        UserAccount accountPharmacy2 = business.getUserAccountDirectory().createUserAccount(pharmacy2.getUsername(), pharmacy2.getPassword(), pharmacy2.getPharmacyId(), new PharmacyRole(), pharmacy2);


    }
}
