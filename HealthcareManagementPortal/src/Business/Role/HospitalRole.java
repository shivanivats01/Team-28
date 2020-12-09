/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.HospitalWorkAreaJPanel;
import UserInterface.SystemAdmin.SystemAdminPortalJPanel;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class HospitalRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem business) {

        return new HospitalWorkAreaJPanel(userProcessContainer,account, business);

    }
    
}
