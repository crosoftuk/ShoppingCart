/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author orgillc
 */
public class ShoppingCart {

    private float total = 0.0f;
    private ArrayList<String> basketContents = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingCart basket = new ShoppingCart();
        
        basket.addItemsToBasket(new String[]{"Apple","Orange"});
        basket.checkout();
    }
    
    /**
     * Add the list of items to the shopping basket
     * @param items List of item names to add
     */
    public void addItemsToBasket(String[] items)
    {
        basketContents.addAll(Arrays.asList(items));
    }
    
    /**
     * Get the cost of the item
     * @param item
     * @return cost in pounds
     */
    public static float lookupItemCost(String item)
    {
        float itemCost = 0.0f;
        switch(item)
        {
            case "Apple":
                itemCost = 0.60f;
                break;
            case "Orange":
                itemCost = 0.25f;
                break;
        }
        return itemCost;
    }
 
    /**
     * Totalise the cost of the basket contents
     * @return cost in pounds
     */
    public void totaliseBasket()
    {
        total = 0.0f;
        
        for(String item : this.basketContents)
        {
            total += lookupItemCost(item);
        }
    }
    
    public void checkout()
    {
        totaliseBasket();
        System.out.println(String.format("Total cost of basket: £%.2f", getTotal()));
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }
}
