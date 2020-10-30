/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jshar
 */
public class FlightDirectory {
    
    private ArrayList<Flight> flightList;
    
    public FlightDirectory() {
        
        flightList = new ArrayList<>();
        
        
    }
    
    public Flight addFlight(Flight flight){
        flightList.add(flight);
        return flight;
    }
    
}
