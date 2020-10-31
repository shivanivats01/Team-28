/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author jshar
 */
public class Flight {
    
    private int flightNumber;
    private String airlineName;
    private String source;
    private String destination;
    private Date startDate;
    private Date endDate;

    public Flight() {
    }
    

//    public Flight(int flightNumber, String airlineName, String source, String destination, Date startDate, Date endDate) {
//
//        this.flightNumber = flightNumber;
//        this.airlineName = airlineName;
//        this.source = source;
//        this.destination = destination;
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }
   

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
    
    @Override
    public String toString()
    {
        String s= Integer.toString(flightNumber);
        return s;
    }
}
