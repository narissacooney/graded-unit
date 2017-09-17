//name: narissa cooney
//date:
//task:

package com.jhshoes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JHShoes {
    
    //Creating methods to connect to NARISSA database

    public void connectDB() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
    }

    //reading from database for Products
    public List<Product> getProductListByGender(Gender gender) {
        //creating a list of products
        List<Product> productList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa")) {
            Statement statement = con.createStatement();
            
            //selects all information from table PRODUCT where GENDER is specific (female, male, unisex)
            ResultSet result = statement.executeQuery("Select * from PRODUCT where GENDER = '" + gender.name() +"'");

            while (result.next()) {
                //creating new instance of PRODUCT
                Product product = new Product();
                
                //reads from database and populates UI
                product.setProductID(Integer.parseInt(result.getString("PRODUCTID")));

                product.setProductDescription(result.getString("DESCRIPTION"));

                product.setProductPrice(Double.parseDouble(result.getString("PRODUCTPRICE")));

                product.setProductQuantity(Integer.parseInt(result.getString("PRODUCTQUANTITY")));

                product.setRestockLevel(Integer.parseInt(result.getString("RESTOCKLEVEL")));
                
                product.setRestockQuantity(Integer.parseInt(result.getString("RESTOCKQUANTITY")));
                
                product.setGender(Gender.valueOf(result.getString("GENDER")));
                productList.add(product);
            }

        } catch (SQLException e) {
            System.out.print(e);
        }
        return productList;
    }

    //writing username and passwords to database for CUSTOMER
    public void writeDB(String input, String values) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa");
            Statement statement = con.createStatement();
            //using values stated in Register Page - button
            String query = ("INSERT INTO NARISSA." + input + "VALUES (" + values + ")");
            statement.executeUpdate(query);
            //prompts user that registration is successfull
            JOptionPane.showMessageDialog(null, "Registration Successfull " + "\nPlease log in to continue");
            System.out.println("Record Added");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Exception Occurred");
            System.out.print(e);
        }

    }

    //STILL TO COMPLETE - TRY UPDATING CUSTOMER DETAILS
    //presents customer with their details and allows them to update information
    //Update Function on database
    public void saveCustomerDetails(Customer customer) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa");
            Statement statement = con.createStatement();
            //updating customer information
            String query = "UPDATE NARISSA.CUSTOMER SET "
                    + "FIRSTNAME = '" + customer.getFirstName() + "', "
                    + "LASTNAME = '" + customer.getLastName() + "', "
                    + "STREET = '" + customer.getStreet() + "', "
                    + "TOWN = '" + customer.getTown() + "', "
                    + "POSTCODE = '" + customer.getPostcode() + "', "
                    + "TELEPHONENUMBER = '" + customer.getTelephoneNumber() + "', "
                    + "EMAIL = '" + customer.getEmail() + "', "
                    + "MOBILENUMBER = '" + customer.getMobileNumber() + "', "
                    + "USERNAME = '" + customer.getUsername() + "' "
                   // + "PASSWORD = '" + customer.getPassword() + "'"
                    + "WHERE CUSTOMERID = '" + customer.getCustomerID() + "'";
                    
           statement.executeUpdate(query);
            
        } catch (SQLException e) {
            System.out.print(e);
        }
    }
    
    //STILL TO COMPLETE - TRY TO ADD/REMOVE PRODUCTS - admin
    //removes customers when they cancel their registration
    public void deleteDB(String values) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa");
            Statement statement = con.createStatement();
            String query = ("DELETE FROM NARISSA.CUSTOMER where customerid like '" + values + "'");
            statement.executeUpdate(query);
            //prompts user that their account has been removed
            JOptionPane.showMessageDialog(null, "Your account has now been removed" + "\n Please re-register to enter");
            System.out.println("Record Removed");
            } 
            catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null, "SQL Exception Occurred");
            System.out.print(e);
            }
    }

    //Reading/Pulling data from CUSTOMER based on customerID
    Customer getCustomerById(String loggedInCustomerId) {
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa");
            Statement statement = con.createStatement();
            //selecting from customer table
            String query = ("SELECT * from CUSTOMER where CUSTOMERID = '" + loggedInCustomerId + "'");
            ResultSet result = statement.executeQuery(query);
            //looking through results to pull out correct ID
            while (result.next()) {
               
                //creating new instance of customer
                Customer customer = new Customer();

                customer.setCustomerID(result.getString("CUSTOMERID"));
                customer.setFirstName(result.getString("FIRSTNAME"));
                customer.setLastName(result.getString("LASTNAME"));
                customer.setStreet(result.getString("STREET"));
                customer.setTown(result.getString("TOWN"));
                customer.setPostcode(result.getString("POSTCODE"));
                customer.setTelephoneNumber(result.getString("TELEPHONENUMBER"));
                customer.setEmail(result.getString("EMAIL"));
                customer.setMobileNumber(result.getString("MOBILENUMBER"));
                customer.setUsername(result.getString("USERNAME"));
                customer.setPassword(result.getString("PASSWORD"));
               
                return customer;
            }
            
        }
        catch (SQLException e) 
            {
            JOptionPane.showMessageDialog(null, "SQL Exception Occurred");
            System.out.print(e);
            }
            return null;
    } 
}
  //  public static ResultSet readDB(String sql)
  //  {
  //      try
  //        { 
  //           Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa");
  //           Statement statement = con.createStatement();
  //           ResultSet rs = statement.executeQuery(sql);

  //          }
  //      catch (SQLException e)
  //      {
  //          JOptionPane.showMessageDialog(null, "SQL Exception Occurred" + e);
  //          System.exit(0);
  //          return null;
   //     }
                
    
    


   
                    
                    
                    //"DELETE NARISSA.CUSTOMER SET"
                    //+ "FIRSTNAME = '" + customer.getFirstName() + "'"
                    //+ "LASTNAME = '" + customer.getLastName() + "'"
                    //+ "STREET = '" + customer.getStreet() + "'"
                    //+ "TOWN = '" + customer.getTown() + "'"
                    //+ "POSTCODE = '" + customer.getPostcode() + "'"
                    //+ "TELEPHONENUMBER = '" + customer.getTelephoneNumber() + "'"
                    //+ "EMAIL = '" + customer.getEmail() + "'"
                    //+ "MOBILENUMBER = '" + customer.getMobileNumber() + "'"
                    //+ "USERNAME = '" + customer.getUsername() + "'"
                    //+ "PASSWORD = '" + customer.getPassword();
            
            
            
    
   // List<Product> getProductList2() {
    //      List<Product> productList2 = new ArrayList<>();

    

    
    
