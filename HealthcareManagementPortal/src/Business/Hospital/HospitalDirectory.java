/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Department.Department;
import Business.Ecosystem;
import Business.Patient.Patient;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    

    public HospitalDirectory(){
        hospitalList = new ArrayList<Hospital>();
       
    }
    
    public ArrayList<Hospital> getHospitalList() {
        return this.hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalList = hospitalDirectory;
    }
    
//    public Hospital add(String adminName,String name, String phone, String address, BufferedImage photo,String licenseNo){
//       Hospital restaurant = new Hospital("H"+(hospitalList.size()+1),adminName, name, phone, address,licenseNo);
//       hospitalList.add(restaurant);
//       return restaurant;
//    }
    public Hospital add(Hospital h){
       
        h.setHospitalId("H"+(hospitalList.size()+1));
        hospitalList.add(h);
        return h;
    }
    
    
    
    public void deleteHospital(int index,Ecosystem system){
        String id = hospitalList.get(index).getHospitalId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        hospitalList.remove(index);
    }
    
    public Hospital getHospitalId(int index){
        return hospitalList.get(index);
    }
    
    public boolean isUniqueLicenseNo(String licenseNo){
        for(Hospital hospital: hospitalList){
            if(hospital.getLicenseNo().equalsIgnoreCase(licenseNo)){
                return false;
            }
        }
        return true;
    }

    public String getHospitalName(String hospitalId) {
        for(Hospital hospital: hospitalList){
            if(hospital.getHospitalId().equalsIgnoreCase(hospitalId)){
                return hospital.getName();
            }
        }
        return "";
    }
    
    public Hospital getHospital(String id){
        for(Hospital hospital: hospitalList){
            if(hospital.getHospitalId().equalsIgnoreCase(id)){
                return hospital;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Hospital hospital: hospitalList){
            if(hospital.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }

    
    
    
}
