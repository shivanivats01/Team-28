/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;


import Business.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class DepartmentDirectory {

    private ArrayList<Department> departmentDirectory;

    public DepartmentDirectory() {
        departmentDirectory = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(ArrayList<Department> departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }
    
      
    public Department getDepartment(String id){
        for(Department department: departmentDirectory){
            if(department.getDepartmentId().equalsIgnoreCase(id)){
                return department;
            }
        }
        return null;
    }
    
    public Department add(Department dep){
        dep.setDepartmentId("Dep"+(departmentDirectory.size()+1));
                
        departmentDirectory.add(dep);
        return dep;
    }
   
    public void deleteDepartment(int index,Ecosystem system){
        String id = departmentDirectory.get(index).getDepartmentId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        departmentDirectory.remove(index);
    }
    
}
    

