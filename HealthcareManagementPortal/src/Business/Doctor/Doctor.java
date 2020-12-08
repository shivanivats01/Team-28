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
    private int id;
    private static int count = 1;

    public Doctor() {
        id = count;
        count++;
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
    
    
    
    
}
