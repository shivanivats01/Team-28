/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.List;

/**
 *
 * @author riyamoitra
 */
public class Doctor {
    
    private String name;
    private String licenseNo;
    //private int NumberOfHospitalsAssociated;
    private List <String> HospitalName;
    private String doctorId;
    private String phoneNo;
    private String emailId;
    private String gender;
    private String username;
   private String password;
    //private static int count = 1;

    public Doctor() {
       
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    

    public List<String> getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(List<String> HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    
    
    
    
}
