/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Department.Department;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class Hospital {
   
    // Member variables
    private String username;
    private String password;
    private String hospitalId;
    private String name;
    private String phoneNo;
    private String address;
    private String adminName;
    private String licenseNo;
    private ArrayList<Department> departmentDirectory;
    
    // Constructor
    public Hospital() {
        this.departmentDirectory = new ArrayList();
    }

    // Getters and Setters
    public ArrayList<Department> getDepartmentDirectory() {
        return departmentDirectory;
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
    
    // Overriding methods
    @Override()
    public String toString() {
        return this.name;
    }
    
    // Methods
    public Department getDepartment(String id){
        for(Department department: departmentDirectory){
            if(department.getDepartmentId().equalsIgnoreCase(id)){
                return department;
            }
        }
        return null;
    }
    
    public Department addDepartment(Department dep){
        dep.setDepartmentId(
                dep.getHospital().getHospitalId() + 
                "-Dep"+(departmentDirectory.size()+1));
                
        departmentDirectory.add(dep);
        return dep;
    }
   
    public void deleteDepartment(String departmentId, Ecosystem system){
        
        // Remove all doctors and this department
        for(Department d: departmentDirectory) {
            if(d.getDepartmentId().equals(departmentId)){
                d.removeAllDoctors(system);
                departmentDirectory.remove(d);
            }
        }
  
        // Remove department from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(departmentId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
    }
    
    public void removeAllDepartments(Ecosystem system){
        
        // Remove all the doctors from doctorList
        for(Department d: departmentDirectory) {
            deleteDepartment(d.getDepartmentId(), system);
        }
        
        this.departmentDirectory = new ArrayList();
        
    }

}
