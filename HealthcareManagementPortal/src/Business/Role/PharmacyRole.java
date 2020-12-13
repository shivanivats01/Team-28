/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;


import UserInterface.Pharmacy.WelcomePharmacyJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shivanivats
 */
public class PharmacyRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem business) {
        return new WelcomePharmacyJPanel(userProcessContainer, account, business);
    
    
    }
}
