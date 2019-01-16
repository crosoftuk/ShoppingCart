/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author orgillc
 */
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void AddApple()
    {
        System.out.println("AddApple");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Apple"});
        basket.checkout();

        assertEquals(0.60f, basket.getTotal(), 0.0f);
    }
    @Test
    public void AddOrange()
    {
        System.out.println("AddOrange");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Orange"});
        basket.checkout();

        assertEquals(0.25f, basket.getTotal(), 0.0f);
    }

    @Test
    public void AddOrangeApple()
    {
        System.out.println("AddOrange");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Orange", "Apple"});
        basket.checkout();

        assertEquals(0.85f, basket.getTotal(), 0.0f);
    }

    
   @Test
    public void Add2Apples()
    {
        System.out.println("Add2Apples");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Apple", "Apple"});
        basket.checkout();

        assertEquals(0.60f, basket.getTotal(), 0.0f);
    }

    @Test
    public void Add2Oranges()
    {
        System.out.println("Add2Oranges");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Orange", "Orange"});
        basket.checkout();

        assertEquals(0.50f, basket.getTotal(), 0.0f);
    }
    @Test
    public void Add3Oranges()
    {
        System.out.println("Add3Oranges");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Orange", "Orange", "Orange"});
        basket.checkout();

        assertEquals(0.50f, basket.getTotal(), 0.0f);
    }
    @Test
    public void Add4Oranges()
    {
        System.out.println("Add3Oranges");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Orange", "Orange", "Orange", "Orange"});
        basket.checkout();

        assertEquals(0.75f, basket.getTotal(), 0.0f);
    }

    @Test
    public void Add3Oranges2Apples()
    {
        System.out.println("Add3Oranges2Apples");
        ShoppingCart basket = new ShoppingCart();
        basket.addItemsToBasket(new String[]{"Apple", "Orange", "Orange", "Orange", "Apple"});
        basket.checkout();

        assertEquals(1.10f, basket.getTotal(), 0.0f);
    }
}
