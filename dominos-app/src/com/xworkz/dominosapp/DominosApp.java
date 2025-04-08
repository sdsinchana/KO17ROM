package com.xworkz.dominosapp;

public class DominosApp {

        public void registerOrder(DominosDto dominos) {
            boolean isOrderValid = isOrderValid(dominos);
            if (isOrderValid) {
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

            // Delivery check is not mandatory; optional validation
            if (!dominos.isDelivery()) {
                System.out.println("This order is for pickup, not delivery.");
            }

            return isValid;
        }
    }


