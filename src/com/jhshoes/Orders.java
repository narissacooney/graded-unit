//name: narissa cooney
//date: 
//task: 

package com.jhshoes;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

//name : Narissa Cooney
public class Orders {
        
        HashMap< Integer, Orders> orders = new HashMap();
    
    private int orderID;
    private Date date;
    private Date estimatedDeliveryDate;
    private String deliveryStatus;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    
    public boolean addOrder(Orders orders)
    {
        if(this.orders.containsKey(orders.getOrderID()))
        {
            return(false);
        }
        else
        {
            this.orders.put(orders.getOrderID(), orders);
        }
            return(true);
    }

    public void connectDB(){
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            } 
            catch(ClassNotFoundException e) {
            System.out.println("Class not found "+ e);
            }
            System.out.println("JDBC Class found");
            }
        
        
    public void writeDB(){
      try {
         Connection con = DriverManager.getConnection ("jdbc:derby://localhost:1527/JHShoes","narissa", "narissa");  
         Statement stmt = con.createStatement();
         
         for(Integer key: orders.keySet());
             
        //     Orders orders = orders.get(key);
                     
       //    stmt.executeUpdate ("INSERT INTO NARISSA.ORDERS (ORDERID, DATE, ESTIMATEDDELIVERYDATE, DELIVERYSTATUS) VALUES ('" + orders.getOrderID() + "','" + orders.getDate() + "','" + orders.getEstimatedDeliveryDate() + "','" + orders.getDeliveryStatus() + ")");
         }
            catch(SQLException e){
            System.out.println("SQL exception occured" + e);
      
        
        }
      }
        
}