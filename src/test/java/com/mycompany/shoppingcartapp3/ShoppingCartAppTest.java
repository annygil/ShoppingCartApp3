/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcartapp3;


import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author ubitica-01
 */
public class ShoppingCartAppTest {
    @Test
    	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
	}
    
}
