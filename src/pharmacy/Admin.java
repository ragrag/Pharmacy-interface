/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.Date;

/**
 *
 * @author Shazly
 */
public class Admin extends User{
    
    public Admin(int id, String name, String username, String password, Pharmacy obj) {
        super(id ,name, username, password);
        isAdmin = true;
        obj.adminList.add(this);

    }
    
    
    
    public void addProduct(int id, String productName, String type, String expiryDate,int price,int q, Pharmacy obj)
    {
    new Product(id,productName,type,expiryDate,price,q,obj);
    }
    
    public void deleteProduct(int id, Pharmacy obj)
    {
    	
    	
    for(int i=0;i<obj.productList.size();i++)
    {
        if(obj.productList.get(i).id == id)
        {
            obj.productList.remove(i);
        }
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
    
    public void viewOrders(Pharmacy obj)
    {
    	System.out.println("ID   Date    Total");
    	for(int i=0;i<obj.orderList.size();i++)
    	{
    		System.out.println(obj.orderList.get(i));	
    	}
    }
    
    
    }
    
