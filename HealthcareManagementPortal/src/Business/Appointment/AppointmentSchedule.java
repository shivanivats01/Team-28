/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class AppointmentSchedule {
    
    
    private ArrayList<Appointment> appointmentSchedule;

    public AppointmentSchedule(){
        appointmentSchedule = new ArrayList<Appointment>();
    }
    
    public ArrayList<Appointment> getAppointmentSchedule() {
        return appointmentSchedule;
    }

    public void setAppointmentDirectory(ArrayList<Appointment> appointmentSchedule) {
        this.appointmentSchedule = appointmentSchedule;
    }
    
    public Appointment addAppointment(){
        Appointment appointment = new Appointment();
        appointmentSchedule.add(appointment);
        return appointment;
    }
    
    public Appointment getAppointmentById(int index){
        return appointmentSchedule.get(index);
    }
    
    public Appointment getAppointmentByAppointmentId(String id){
        for(Appointment appointment: appointmentSchedule){
            if(appointment.getAppointmentId().equalsIgnoreCase(id)){
                return appointment;
            }
        }
        return null;
    }
    
    
}
