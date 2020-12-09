/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Ecosystem;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class HospitalDirectory {
    
   
    
     private ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory(){
        hospitalDirectory = new ArrayList<Hospital>();
       
    }
    
    public ArrayList<Hospital> getRestaurantDirectory() {
        return this.hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital add(String adminName,String name, String phone, String address, BufferedImage photo,String licenseNo){
       Hospital restaurant = new Hospital("H"+(hospitalDirectory.size()+1),adminName, name, phone, address,licenseNo);
       hospitalDirectory.add(restaurant);
       return restaurant;
    }
    
    public void deleteHospital(int index,Ecosystem system){
        String id = hospitalDirectory.get(index).getHospitalId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        hospitalDirectory.remove(index);
    }
    
    public Hospital getHospitalId(int index){
        return hospitalDirectory.get(index);
    }
    public boolean isUniqueLicenseNo(String licenseNo){
        for(Hospital hospital: hospitalDirectory){
            if(hospital.getLicenseNo().equalsIgnoreCase(licenseNo)){
                return false;
            }
        }
        return true;
    }

    public String getHospitalName(String hospitalId) {
        for(Hospital hospital: hospitalDirectory){
            if(hospital.getHospitalId().equalsIgnoreCase(hospitalId)){
                return hospital.getName();
            }
        }
        return "";
    }
    
    public Hospital getHospital(String id){
        for(Hospital hospital: hospitalDirectory){
            if(hospital.getHospitalId().equalsIgnoreCase(id)){
                return hospital;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Hospital hospital: hospitalDirectory){
            if(hospital.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    
}
