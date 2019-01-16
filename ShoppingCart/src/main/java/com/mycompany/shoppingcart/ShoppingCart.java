/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart;

import java.util.ArrayList;

/**
 *
 * @author orgillc
 */
public class ShoppingCart {

    private ArrayList<String> basketContents = new ArrayList<>();
    private float subTotal = 0.0f;
    private float discounts = 0.0f;
    private float total = 0.0f;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingCart basket = new ShoppingCart();
        
        basket.addItemsToBasket(new String[]{"Apple","Orange", "Orange", "Orange"});
        basket.checkout();
        basket.printTotal();
    }
    
    /**
     * Add the list of items to the shopping basket
     * @param items List of item names to add
     */
    public void addItemsToBasket(String[] items)
    {
        for(String item : items)
        {
            addItem(item);
        }
    }
    
    public void addItem(String item)
    {
        basketContents.add(item);
        totaliseBasket();
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
     * calculate the basket Totals
     */
    public void totaliseBasket()
    {
        subTotal = 0.0f;

        for(String item : this.basketContents)
        {
            subTotal += lookupItemCost(item);
        }
        
    }

    // Buy one,get one free on Apples
    // 3 for 2 on Oranges
    public void applyDiscounts()
    {
        int appleCount = 0;
        int orangeCount = 0;
        float orangePrice = lookupItemCost("Orange");
        float applePrice = lookupItemCost("Apple");
        
        for(String item: this.basketContents)
        {
            if(item.equals("Apple"))
            {
                appleCount++;
            }
            else if(item.equals("Orange"))
            {
                orangeCount ++;
            }
        }
        
        discounts -= (appleCount/2) * applePrice;
        discounts -= (orangeCount/3) * orangePrice;
        
        total = subTotal + discounts;
    }

    public void checkout()
    {
        totaliseBasket();
        applyDiscounts();
        printTotal();
    }
    
    public void printTotal()
    {
        System.out.println("Subtotal cost of basket: £" + subTotal);
        System.out.println("Discounts: £" + discounts);
        System.out.println(String.format("Total cost of basket: £%.2f", getTotal()));
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }
}
