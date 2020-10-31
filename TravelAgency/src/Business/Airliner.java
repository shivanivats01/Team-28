/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author jshar
 */
public class Airliner {
    
    private String airlineName;
    private int numberOfAirplane;
    private int numberOfEmployees;
    private FlightDirectory flightDirectory;
    
    public Airliner(String airlineName, int numberOfAirplane, int numberOfEmployee) {
        this.airlineName = airlineName;
        this.numberOfAirplane = numberOfAirplane;
        this.numberOfEmployees = numberOfEmployee;
        this.flightDirectory = new FlightDirectory();  
    }
    
    public Airliner(){
        flightDirectory = new FlightDirectory();
    }

    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumberOfAirplane() {
        return flightDirectory.getFlightList().size();
    }

//    public void setNumberOfAirplane(int numberOfAirplane) {
//        this.numberOfAirplane = numberOfAirplane;
//    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public String toString()
    {
        return airlineName;
    }
    
    
}
