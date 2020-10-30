/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author jshar
 */
public class Seat {
    private Flight flight;
    HashMap<Integer,ArrayList<Integer>> map;
    
    public Seat(Flight flight) {
        this.flight = flight;
        map = new HashMap<>();
    }
    
    
}
