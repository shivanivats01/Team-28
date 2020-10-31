/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.SearchFlights.*;
import java.util.ArrayList;

/**
 *
 * @author jshar
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory() {
        customerDirectory = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer newCustomer(){
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }
    
}
