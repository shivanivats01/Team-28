/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Appointment.AppointmentSchedule;
import Business.Doctor.DoctorDirectory;
import Business.Ecosystem;
import Business.Hospital.HospitalDirectory;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminPortalJPanel;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class SystemAdminRole extends Role {
    

   
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem business) {
        return new SystemAdminPortalJPanel(userProcessContainer,account, business);
    }

}
