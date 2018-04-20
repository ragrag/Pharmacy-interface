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
public class Product {
    int id;
    String productName;
    String type;
    String expiryDate;
    int price;
    int quantity;
    public Product(int id, String productName, String type, String expiryDate,int price,int q, Pharmacy obj) {
        this.id = id;
        this.productName = productName;
        this.type = type;
        this.expiryDate = expiryDate;
        this.price = price;
        this.quantity = q;
        obj.productList.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStock() {
        return String.valueOf(quantity);
    }

    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getPrice() {
        return price;
    }

    
    public void setPrice(int price) {
        this.price = price;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (productName + "      " + price + "     " + id);
	}
    
    
  
    
    
    
    
    
}
