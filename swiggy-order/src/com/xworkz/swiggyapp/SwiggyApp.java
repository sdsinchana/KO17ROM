package com.xworkz.swiggyapp;

public class SwiggyApp {
SwiggyDto dto;
        public void placeOrder(SwiggyDto dto) {
            boolean isvalid = false;
            boolean isValid = isOrderValid(dto);
            if (isValid) {
                isvalid = true;
                this.dto = dto;
                System.out.println("Order placed successfully on Swiggy!");
            } else {
                System.out.println("Order placement failed. Please check the order details.");
            }
        }

        public boolean isOrderValid(SwiggyDto dto) {
            boolean isValid = true;

            if (dto.getRestaurantName()== null || dto.getRestaurantName().isEmpty()) {
                System.out.println("Restaurant name cannot be empty.");
                isValid = false;
            }

            if (dto.getFoodItem() == null || dto.getFoodItem().isEmpty()) {
                System.out.println("Food item must be specified.");
                isValid = false;
            }

            if (dto.getCuisineType() == null || dto.getCuisineType().isEmpty()) {
                System.out.println("Cuisine type must be provided.");
                isValid = false;
            }

            if (dto.getDeliveryLocation() == null || dto.getDeliveryLocation().isEmpty()) {
                System.out.println("Delivery location is required.");
                isValid = false;
            }

            if (dto.getPrice() <= 0) {
                System.out.println("Price must be greater than zero.");
                isValid = false;
            }


            if (!dto.isVeg()) {
                System.out.println("Note: This is a non-vegetarian item.");
            }

            return isValid;
        }
        public void fetchDetails(){
            System.out.println("Restaurant Name :"+dto.getRestaurantName());
            System.out.println("Food Item :"+dto.getFoodItem());
            System.out.println("Cuisine Type :"+dto.getCuisineType());
            System.out.println("Delivery Location :"+dto.getDeliveryLocation());
            System.out.println("Price :"+dto.getPrice());
            System.out.println("Veg :"+dto.isVeg());
        }
    }


