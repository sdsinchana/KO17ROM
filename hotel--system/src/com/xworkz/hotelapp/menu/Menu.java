package com.xworkz.hotelapp.menu;

public class Menu {
    public int itemId ;
    public String itemName ;
    public String[] ingredients;
    public double itemPrice ;

    public void menuDetails(){
        System.out.println("Item Id: "+this.itemId);
        System.out.println("Item Name: "+this.itemName);
        for(String ingredient : ingredients){
            System.out.println(ingredient);
        }
        System.out.println("Item Price: Rs."+this.itemPrice);
    }
}
