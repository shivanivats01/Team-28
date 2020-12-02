/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;


import java.util.ArrayList;

/**
 *
 * @author riyamoitra
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public HospitalDirectory() {
        hospitalList = new ArrayList();
    }

    
    
    
}
