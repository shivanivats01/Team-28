
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
    
    Airliner airline1 = new Airliner("JetBlue", 0, 100);
    Airliner airline2 = new Airliner("Delta", 0 , 89);
    Airliner airline3 = new Airliner("AirAmerica", 0, 99);
    Airliner airline4 = new Airliner("SpiceJet", 0, 39);
    
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
    
     public Airliner newAirliner(){
        Airliner airline = new Airliner();
        airlineList.add(airline);
        return airline;
    }
    
    public void removeAirline(Airliner airline){
        airlineList.remove(airline);
    }
    
    public ArrayList<String> getAirlineNames() {
        ArrayList<String> airlineNames = new ArrayList<String>();
        for(int i= 0; i <= airlineList.size() - 1; i++){
            Airliner currentAirliner = airlineList.get(i);
            airlineNames.add(currentAirliner.getAirlineName());
        }
        
        return airlineNames;
    }
}
