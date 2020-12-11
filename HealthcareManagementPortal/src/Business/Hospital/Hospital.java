/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Appointment.Appointment;
import Business.Appointment.AppointmentSchedule;
import Business.Department.Department;
import Business.Department.DepartmentDirectory;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class Hospital {
   
    private String username;
    private String password;
    private String hospitalId;
    private String name;
    private String phoneNo;
    private String address;
    private String adminName;
    private String licenseNo;

    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(DepartmentDirectory DepartmentDirectory) {
        this.departmentDirectory = DepartmentDirectory;
    }
    
    private DepartmentDirectory departmentDirectory;
    
    private AppointmentSchedule appointmentSchedule;

    public Hospital(String hospitalId,String adminName,String name,String phoneNo, String address,String licenseNo){
        this.adminName = adminName;
        this.hospitalId =hospitalId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
      
        this.licenseNo = licenseNo;
       departmentDirectory = new DepartmentDirectory();
    }
    
    public Hospital() {
    
    
    }


    public AppointmentSchedule getAppointmentSchedule() {
        return appointmentSchedule;
    }

    public void setAppointmentSchedule(AppointmentSchedule appointmentSchedule) {
        this.appointmentSchedule = appointmentSchedule;
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
    
    @Override()
    public String toString() {
        return this.hospitalId;
    }
    
    
    
}
