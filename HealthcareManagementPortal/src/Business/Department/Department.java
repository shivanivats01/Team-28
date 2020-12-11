/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Hospital.Hospital;

/**
 *
 * @author riyamoitra
 */
public class Department {
    
    private String departmentId;
    private String departmentName;
    private Hospital hospital;
    
    private String departmentAdminName;
    
    public Department() {
       
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAdminName() {
        return departmentAdminName;
    }

    public void setDepartmentAdminName(String departmentAdminName) {
        this.departmentAdminName = departmentAdminName;
    }
 
    
    
    
    
}
