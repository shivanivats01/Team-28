/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author jshar
 */
public class Seat {
    HashMap<Integer, HashSet<String>> seats_map;
    
    public Seat() {
        seats_map = new HashMap<>();
    }

    public HashSet<String> getSeats(int flight) {
        return seats_map.getOrDefault(flight, new HashSet<String>());
    }

    public void setSeat(int flight, String seat) {
        HashSet<String> set = seats_map.getOrDefault(flight, new HashSet<String>());
        set.add(seat);
        seats_map.put(flight,set);
    }    

    public HashMap<Integer, HashSet<String>> getSeats_map() {
        return seats_map;
    }

    public void setSeats_map(HashMap<Integer, HashSet<String>> seats_map) {
        this.seats_map = seats_map;
    }
    
    
}
