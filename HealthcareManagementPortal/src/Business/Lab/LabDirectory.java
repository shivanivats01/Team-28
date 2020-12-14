/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class LabDirectory {
    
    private ArrayList<Lab> labList;
    
    public LabDirectory(){
        labList = new ArrayList<Lab>();
    }

    public ArrayList<Lab> getLabList() {
        return labList;
    }

    public void setLabList(ArrayList<Lab> LabDirectory) {
        this.labList = LabDirectory;
    }
    
    public Lab addLab(Lab l){
        l.setLabID("Lab"+(labList.size()+1));
                
        labList.add(l);
        return l;
    }
    public boolean isPhoneUnique(String phone){
        for(Lab lab: labList){
            if(lab.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
     public Lab getLab(String id){
        for(Lab lab: labList){
            if(lab.getLabID().equalsIgnoreCase(id)){
                return lab;
            }
        }
        return null;
    }
     
public void deleteLab(String labId, Ecosystem system){
        
        // Remove the patient from patientList
        for(Lab p: labList) {
            if(p.getLabID().equals(labId)){
                labList.remove(p);
            }
        }
    
    
}
}
