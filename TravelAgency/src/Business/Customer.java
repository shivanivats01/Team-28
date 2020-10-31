/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import javafx.util.Pair;
import javax.swing.RowFilter.Entry;

/**
 *
 * @author jshar
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailID;
    private String password;
    private ArrayList<Pair<Flight,String>> bookedFlights = new ArrayList<>();
    
    public Customer(String firstName, String lastName, int age, String gender, String emailID, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.gender = gender;
       this.emailID = emailID;
       this.password = password;
       
    }

    Customer() {
         //To change body of generated methods, choose Tools | Templates.
         
    }
    
    
    public String getFirstNmae() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFlightInfo(Flight flight, String str) {
        bookedFlights.add(new Pair<Flight, String>(flight, str));
    }

    public void setGender(String text) {
        this.gender = text; 
    }
    public String getGender() {
        return gender; 
    }    
    
}

