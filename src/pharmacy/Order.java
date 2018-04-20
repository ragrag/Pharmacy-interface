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
public class Order {
    int id;
    Date orderDate;
    ArrayList <Product> orderProducts;
    int total;
    boolean confirmed = false;
    Order(int id, Date orderDate) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderProducts = new ArrayList <Product>();
        total = 0;
    }
    
    public void addProduct(Product p)
    {
        orderProducts.add(p);
        total+=p.getPrice();
    }
    
    public String getDate()
    {
        return String.valueOf(orderDate);
    }
    
    public String getConfirmation()
    {
     return confirmed?  "Confirmed" : "Not Confirmed";   
    }
    
    public int getTotal()
    {
     return total;
    }

	@Override
	public String toString() {
		return (id + "  " + orderDate + "   " + total + "  " + getConfirmation());
	}
    
    
}
