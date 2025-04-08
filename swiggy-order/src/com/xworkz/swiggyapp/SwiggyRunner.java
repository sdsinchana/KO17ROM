package com.xworkz.swiggyapp;

public class SwiggyRunner {


        public static void main(String[] args) {
            SwiggyDto dto = new SwiggyDto();

            dto.setRestaurantName("Domino's Pizza");
            dto.setFoodItem("Veggie Loaded Pizza");
            dto.setCuisineType("Italian");
            dto.setDeliveryLocation("JP Nagar, Bangalore");
            dto.setPrice(399.00);
            dto.setVeg(true);

            SwiggyApp app = new SwiggyApp();
            app.placeOrder(dto);
        }
}


