/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Shazly
 */
public class Customer extends User{
    
    public String address;
    public String creditCard;
    public ArrayList <Order> orderList;

    public Customer(int id, String name, String username, String password, String address, String cc,Pharmacy obj) {
        super(id , name, username, password);
        address = this.address;
        creditCard = cc;
        orderList = new ArrayList<Order>();
        obj.customerList.add(this);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    
    public void viewOrders()
    {
    	System.out.println("ID             Date               Total");
        for(int i=0;i<orderList.size();i++)
        {
         System.out.println(orderList.get(i));	
        }
    }
    
    public void viewProducts(Pharmacy obj)
    {
    	System.out.println("Name        Price      ID  ");
    	for(int i=0;i<obj.productList.size();i++)
    	{
    		System.out.println(obj.productList.get(i));	
    	}
    }
    public Order makeOrder(int id, Date orderDate)
    {
        return new Order(id,orderDate);
    }
    
    public void confirmOrder(Order o,Pharmacy obj)
    {
        orderList.add(o);
        obj.orderList.add(o);
     
    }
}
