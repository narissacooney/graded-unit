//name : Narissa Cooney
//date: 30/04/2017
//task: creating customer class

package com.jhshoes;

import java.util.HashMap;
import java.util.Random;


public class Customer {

    //declaring variables
    private String customerID;
    private String firstName;
    private String lastName;
    private String street;
    private String town;
    private String postcode;
    private String telephoneNumber;
    private String email;
    private String mobileNumber;
    private String password;
    private String confirmPassword;
    private String username;

    //getters and setters for variables
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobile) {
        this.mobileNumber = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public HashMap<String, Customer> customerCollection;

    HashMap<String, Customer> customer = new HashMap();

    public HashMap<String, Customer> getCustomer() {
        return customerCollection;
    }

    public Customer() {
        customerCollection = new HashMap<String, Customer>();

    }

    public int addCustomer(Customer aNewCustomer) {
        return 0; //need to fix this
    }

    public Customer getCustomer(String customerID) {
        if (customerCollection.containsKey(customerID)) {
            return customerCollection.get(customerID);
        } else {
            return null;
        }
    }

    public void updateCustomer(Customer customer) {
        //customer.put(customer.getCustomerID(), customer);
    }

    public String[] checkCustomer() {
        String[] customerList = new String[customer.size()];
        int count = 0;

        for (String key : customer.keySet()) {
            customerList[count] = key;
            count++;
        }
        return customerList;
    }

    //  void addCustomerToDB(String firstName, String  lastName, int customerID) 
    //  {
    //  }
    boolean exists(String customerID) {
        if (customerCollection.containsKey(customerID) == true) {
            return true;
        } else {
            return false;
        }
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {

        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return null;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}



