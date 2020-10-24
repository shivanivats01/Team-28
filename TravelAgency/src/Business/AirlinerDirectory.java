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
public class AirlinerDirectory {
    private ArrayList<Airliner> airlineList;
    
    Airliner airline1 = new Airliner("JetBlue", 120, 65, 55, 800);
    Airliner airline2 = new Airliner("Delta", 98, 50, 48, 689);
    Airliner airline3 = new Airliner("AirAmerica", 116, 79, 37, 499);
    Airliner airline4 = new Airliner("SpiceJet", 67, 67, 0, 389);
    
    public AirlinerDirectory() {
        airlineList = new ArrayList<>();
        airlineList.add(airline1);
        airlineList.add(airline2);
        airlineList.add(airline3);
        airlineList.add(airline4);
    }

    public ArrayList<Airliner> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(ArrayList<Airliner> airlineList) {
        this.airlineList = airlineList;
    }
    
     public Airliner addAirline(Airliner airline){
        airlineList.add(airline);
        return airline;
    }
    
    public void removeAirline(Airliner airline){
        airlineList.remove(airline);
    }
    
}
