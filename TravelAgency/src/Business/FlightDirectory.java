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

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public FlightDirectory() {
        
        flightList = new ArrayList<>();
    }
    
    public Flight addFlight(){
        Flight f = new Flight();
        flightList.add(f);
        return f;
        
    }
    public Flight searchFlight(String keyword){
        for (Flight flight : flightList) {
            if(Integer.toString(flight.getFlightNumber()).equals(keyword) ){
                return flight;
            }
        }
        return null;
    }
    
    public void removeFlight(Flight f){
        flightList.remove(f);
    }
    
}
