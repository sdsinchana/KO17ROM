package com.xworkz.hotelapp.hotel;
import com.xworkz.hotelapp.menu.Menu;

public class Hotel {
    public int hotelId;
    public String hotelName;
    public String hotelLocation;
    public String[] hotelBranches;
    public Menu[] menus;

    public void hotelDetails() {
        System.out.println("Hotel Id: " + this.hotelId);
        System.out.println("Hotel Name: " + this.hotelName);
        System.out.println("Hotel Location: " + this.hotelLocation);
        for (String branches : hotelBranches) System.out.println(branches);
        for (Menu menu : menus) {
            menu.menuDetails();
        }
    }
}
