package com.xworkz.dominosapp;

public class DominosApp {
DominosDto dto;
        public void registerOrder(DominosDto dominos) {
            boolean isorderValid = false;
            boolean isOrderValid = isOrderValid(dominos);
            if (isOrderValid) {
                isorderValid = true;
                dto = dominos;
                System.out.println("Pizza order placed successfully!");
            } else {
                System.out.println("Pizza order failed. Please check the order details.");
            }
        }

        public boolean isOrderValid(DominosDto dominos) {
            boolean isValid = true;

            if (dominos.getPizzaName() == null || dominos.getPizzaName().isEmpty()) {
                System.out.println("Invalid pizza name.");
                isValid = false;
            }

            if (dominos.getSize() == null || dominos.getSize().isEmpty()) {
                System.out.println("Invalid pizza size.");
                isValid = false;
            }

            if (dominos.getToppings() == null || dominos.getToppings().isEmpty()) {
                System.out.println("Toppings must be specified.");
                isValid = false;
            }

            if (dominos.getQuantity() <= 0) {
                System.out.println("Quantity must be greater than zero.");
                isValid = false;
            }

            if (dominos.getPrice() <= 0) {
                System.out.println("Price must be greater than zero.");
                isValid = false;
            }


            if (!dominos.getIsDelivery()) {
                System.out.println("This order is for pickup, not delivery.");
            }

            return isValid;
        }
        public void fetchDetails(){
            System.out.println("Pizza Name :"+dto.getPizzaName());
            System.out.println("Size :"+dto.getSize());
            System.out.println("Toppings :"+dto.getToppings());
            System.out.println("Quantity :"+dto.getQuantity());
            System.out.println("Price :"+dto.getPrice());
            System.out.println("Delivery :"+dto.getIsDelivery());
        }
    }


