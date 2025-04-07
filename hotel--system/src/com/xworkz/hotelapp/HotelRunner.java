package com.xworkz.hotelapp;
import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.menu.Menu;

public class HotelRunner {
    public static  void main (String [] args){
        System.out.println("Main Started");
        String[] hotelBranches = {"VijayaNagar" , "JayaNagar" , "JPNagar"};
        String[] ingredientsForTea = {"Milk" , "Tea Powder" , "Sugar" , "Water" };
        String[] ingredientsForPalav = {"Rice" , "Water" , "Vegetables" , "Oil" , "Masala Items" , "Ghee"};


        // Menu class details:-
        Menu[] menus = new Menu[2];

        Menu menu1 = new Menu() ;
        menu1.itemId = 1;
        menu1.itemName = "Tea";
        menu1.ingredients = ingredientsForTea;
        menu1.itemPrice = 15.00;

        Menu menu2= new Menu();
        menu2.itemId = 2;
        menu2.itemName = "Palav";
        menu2.ingredients = ingredientsForPalav;
        menu2.itemPrice = 80.00;

        menus[0] = menu1;
        menus[1] = menu2;

        menu1.menuDetails();
        menu2.menuDetails();

        // Hotel class details:-
        Hotel hotel1 = new Hotel();
        hotel1.hotelId = 1;
        hotel1.hotelName = "Motel";
        hotel1.hotelLocation = "RR Nagar";
        hotel1.hotelBranches = hotelBranches ;
        // Hotel - menus[2]
        hotel1.menus = menus;
        hotel1.hotelDetails();

        System.out.println("Main Ended");

    }
}
