/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcartapp3;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author ubitica-01
 */
public class ShoppingCart {

 
	private List<Product> productList = new ArrayList();
	private double totalCartValue;
        
	public int getProductCount() {
		return productList.size();
	}
	public void addProduct(Product product) {
		productList.add(product);
	}
 
	public double getTotalCartValue() {
		if (productList.size() > 0) {
			for (Product product : productList) {
				totalCartValue = totalCartValue + product.getTotalPrice();
			}
		}
		return totalCartValue;
	}
    
}
