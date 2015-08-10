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
	
	public int getProductCount() {
		return productList.size();
	}
 
	public void addProduct(Product product) {
		productList.add(product);
	}
    
}
