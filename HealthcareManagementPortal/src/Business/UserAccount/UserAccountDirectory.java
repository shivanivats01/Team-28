/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class UserAccountDirectory {
    
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
   
    
    public UserAccount getUserByEmployeeId(String id){
        for(UserAccount user: userAccountList){
            if(user.getEmployee().getName().equalsIgnoreCase(id)){
                return user;
            }
        }
        return null;
    }
    
    public void removeAllAccounts(){
        for(int i =0 ; i< userAccountList.size();i++)
            if(!userAccountList.get(i).getUsername().equalsIgnoreCase("sysadmin"))
                userAccountList.remove(i);
        
        for(int i =0 ; i< userAccountList.size();i++)
            System.out.println(userAccountList.get(i).getEmployee());
    }
    
    
}
