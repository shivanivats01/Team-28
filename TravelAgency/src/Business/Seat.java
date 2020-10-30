/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashSet;


/**
 *
 * @author jshar
 */
public class Seat {
    private int flightNumber;
    HashSet<String> set;
    
    public Seat(int flight) {
        this.flightNumber = flight;
        set = new HashSet<>();
    }

    public HashSet<String> getSet() {
        return set;
    }

    public void setSet(HashSet<String> set) {
        this.set = set;
    }


    public void addHashValue(String str) {
       set.add(str);
    }

    
    
}
