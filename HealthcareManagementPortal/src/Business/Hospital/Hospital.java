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
    private String hospitaltId;
    private String hospitalName;
    private String phoneNo;
    private String address;
    private BufferedImage photo;
    private String hospitalAdminName;
    private String licenseNo;

    public Hospital(String hospitaltId ,String hospitalAdminName,String hospitalName ,String phoneNo, String address, BufferedImage photo,String licenseNo){
        this.hospitalAdminName = hospitalAdminName;
        this.hospitaltId =hospitaltId;
        this.hospitalName = hospitalName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.photo = photo;
        this.licenseNo = licenseNo;
    }

    public String getHospitaltId() {
        return hospitaltId;
    }

    public void setHospitaltId(String hospitaltId) {
        this.hospitaltId = hospitaltId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public BufferedImage getPhoto() {
        return photo;
    }

    public void setPhoto(BufferedImage photo) {
        this.photo = photo;
    }

    public String getHospitalAdminName() {
        return hospitalAdminName;
    }

    public void setHospitalAdminName(String hospitalAdminName) {
        this.hospitalAdminName = hospitalAdminName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    
    
    
}
