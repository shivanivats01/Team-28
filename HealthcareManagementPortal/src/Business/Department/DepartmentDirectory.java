/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;


import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class DepartmentDirectory {

    private ArrayList<Department> departmentList;

    public DepartmentDirectory() {
        departmentList = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentDirectory) {
        this.departmentList = departmentDirectory;
    }
    
      
    public Department getDepartment(String id){
        for(Department department: departmentList){
            if(department.getDepartmentId().equalsIgnoreCase(id)){
                return department;
            }
        }
        return null;
    }
    
    public Department add(Department dep){
        dep.setDepartmentId("Dep"+(departmentList.size()+1));
                
        departmentList.add(dep);
        return dep;
    }
   
    public void deleteDepartment(String departmentId, Ecosystem system){
        
        // Remove all doctors and this department
        for(Department d: departmentList) {
            if(d.getDepartmentId().equals(departmentId)){
                d.getDoctorDirectory().removeAllDoctors(system);
                departmentList.remove(d);
            }
        }
  
        // Remove department from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getEmployee().getName().equals(departmentId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
        
        // Remove department from employeeList
        for(Employee employee: system.getEmployeeDirectory().getEmployeeList()) {
            if(employee.getName().equals(departmentId)) {
                system.getEmployeeDirectory().getEmployeeList().remove(employee);
            }
        }
    }
    
    public void removeAllDepartments(Ecosystem system){
        
        // Remove all the doctors from doctorList
        for(Department d: departmentList) {
            deleteDepartment(d.getDepartmentId(), system);
        }
        
        this.departmentList = new ArrayList();
        
    }
    
}
    

