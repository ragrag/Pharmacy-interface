/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Shazly
 */
public class Main {
	
static Pharmacy p;
static Admin admin;
static Customer customer;
static Scanner sc;
    public static void main(String args[])
    {
init();
 mainScreen();
    
    }
    public static void init()
    {
        p = new Pharmacy();
        admin = new Admin(1,"Ahmed Omar","aomar","12345678",p);
        customer = new Customer(1,"Omar Mohamed","omar123","12345678","23 Ahmed Fakhry","1236569845223568",p);	
        sc = new Scanner(System.in);
        Product p1 = new Product (1, "Panadol", "Medication", "28/03/2020", 14, 5, p);
        Product p2 = new Product (2, "Excidreen", "Medication", "22/08/2019", 11, 19, p);
        Product p3 = new Product (3, "Cataflam", "Medication", "12/07/2019", 24, 6, p);
    
    }
    public static void mainScreen()
    {
    System.out.println("Choose a user");
    System.out.println("1 - Admin");
    System.out.println("2 - Customer");
    int selection = -1;
    while (selection != 1 && selection != 2)
    	selection =   sc.nextInt();
    if(selection == 1)
    	adminScreen();
    if(selection == 2 )
    	customerScreen();
    
    }
    public static void adminScreen()
    {
        System.out.println("Choose an action");
        System.out.println("1 - Add Product");
        System.out.println("2 - Delete Product");
        System.out.println("3 - View Products");
        System.out.println("4 - View Orders");
        System.out.println("5 - Back To Main Screen");
        int selection = -1;
        while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5)
        	selection =   sc.nextInt();
        
        if(selection == 1)
        {
        	int pid,price,q;
        	String pname,ptype,expdate;
        	System.out.println("Enter Product id");
        		pid = sc.nextInt();
        		
        	System.out.println("Enter Product price");
        		price = sc.nextInt();	
        		
        	System.out.println("Enter Product Quantity");
        		q = sc.nextInt();	     
        		sc.nextLine();
        		
        	System.out.println("Enter Product Name ");
        		pname = sc.nextLine();	      
        		
        	System.out.println("Enter Product Type ");
        		ptype = sc.nextLine();	  	 
        		
        	System.out.println("Enter Product Expiry Date ");
        		expdate = sc.nextLine();	
        		
        	admin.addProduct(pid, pname, ptype, expdate, price, q, p);	
        	
        	System.out.println("Product Added!");
        }
        
        if(selection == 2 )
        {
        	
        	
        	 	admin.viewProducts(p);
        	int pid;
        	System.out.println("Enter Product id");
        		pid = sc.nextInt();
        	admin.deleteProduct(pid, p);
        	
        	System.out.println("Product Removed");	
        }
        
        if(selection == 3)
        	admin.viewProducts(p);
        	
        	
        
        if(selection == 4 )
	        admin.viewOrders(p);
        
        if(selection == 5)
	        mainScreen();
        System.out.println("1 - Do Another Action");
        System.out.println("2 - Main Screen");
        selection = -1;
        while (selection != 1 && selection != 2 )
        	selection =   sc.nextInt();
        
        if(selection == 1)
        	adminScreen();
        if(selection == 2)
        	mainScreen();
    }
    
    public static void customerScreen()
    {
    	  System.out.println("Choose an action");
          System.out.println("1 - Make Order");
          System.out.println("2 - View Orders");
          System.out.println("3 - Back to Main Screen");
          int selection = -1;
          while (selection != 1 && selection != 2 && selection != 3)
          	selection =   sc.nextInt();
         if (selection == 1) 
         {
       	  Order order = customer.makeOrder(1,new Date());
          while(selection == 1)
          	{
     
        	  System.out.println("Enter Product id you want to add to order");
        	  customer.viewProducts(p);
        	  int pid;
        	  	pid = sc.nextInt();
        	  order.addProduct(p.getProduct(pid));
        	  
        	  System.out.println("Product Added, Order total is "+ order.getTotal());
              System.out.println("1 - Add another Product");
              System.out.println("2 - Confirm Order");
              System.out.println("3 - Cancel and go back");
              
              selection = -1;
              while (selection != 1 && selection != 2 && selection !=3)
              	selection =   sc.nextInt();
              
              if(selection == 2)
              {
            	  customer.confirmOrder(order, p);
            	  System.out.println("Order Confirmed!");
            	   System.out.println("1 - Do Another Action");
                   System.out.println("2 - Main Screen");
                   selection = -1;
                   while (selection != 1 && selection != 2 )
                   	selection =   sc.nextInt();
                   
                   if(selection == 1)
                   	customerScreen();
                   if(selection == 2)
                   	mainScreen();
              }
              
              if(selection == 3 )
            	  customerScreen();
              }
          	}
         
          if(selection == 2 )
          {
          	customer.viewOrders();
          	customerScreen();
          }
          
          if(selection == 3 )
          {
          	mainScreen();
          }
    }
    
    }

