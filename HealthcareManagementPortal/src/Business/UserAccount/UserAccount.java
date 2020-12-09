/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author riyamoitra
 */
public class UserAccount {
    
   
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
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

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        System.out.println(" Username : " + username);
        System.out.println(" password : " + password);
//        System.out.println(" employee id : " + employee.getId());
//        System.out.println(" employee name : " + employee.getName());
//        System.out.println(" role : " + role.toString());
//        System.out.println(" workQueue length: " + workQueue.getWorkRequestList().size());
        
        return username;
    }
    
    
}
