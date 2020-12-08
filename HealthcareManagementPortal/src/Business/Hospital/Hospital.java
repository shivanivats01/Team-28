/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.awt.image.BufferedImage;

/**
 *
 * @author riyamoitra
 */
public class Hospital {
    
    private String hospitalId;
    private String name;
    private String phoneNo;
    private String address;
   
    private String adminName;
    private String licenseNo;

    public Hospital(String hospitalId,String adminName,String name,String phoneNo, String address,String licenseNo){
        this.adminName = adminName;
        this.hospitalId =hospitalId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
      
        this.licenseNo = licenseNo;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    
    
}
