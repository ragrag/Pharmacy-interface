/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Shazly
 */
public class Pharmacy {

   public ArrayList <Admin> adminList;
   public ArrayList <Customer> customerList;
   public ArrayList <Order> orderList;
   public ArrayList <Product> productList;

    public Pharmacy() {
     adminList = new ArrayList<Admin>();
     customerList = new ArrayList<Customer>();
     orderList = new ArrayList<Order>();
     productList = new ArrayList<Product>();
    }
   
   public Product getProduct(int id)
   {
	   for (int i=0;i<productList.size();i++)
	   {
		   if(productList.get(i).id == id)
			   return productList.get(i);
	   }
	   return new Product(-1, null, null, null, 0, 0, null);
   }
    
    
    
    
}
