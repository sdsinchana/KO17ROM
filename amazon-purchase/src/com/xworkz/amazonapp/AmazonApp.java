package com.xworkz.amazonapp;

public class AmazonApp {


        public void registerOrder(AmazonDto amazon) {
            boolean isOrderValid = isOrderValid(amazon);
            if (isOrderValid) {
                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Order placement failed. Please check the product details.");
            }
        }

        public boolean isOrderValid(AmazonDto amazon) {
            boolean isValid = true;

            if (amazon.getProductName() == null || amazon.getProductName().isEmpty()) {
                System.out.println("Invalid product name.");
                isValid = false;
            }

            if (amazon.getPrice() <= 0) {
                System.out.println("Price must be greater than zero.");
                isValid = false;
            }

            if (amazon.getQuantity() <= 0) {
                System.out.println("Quantity must be greater than zero.");
                isValid = false;
            }

            if (amazon.getSellerName() == null || amazon.getSellerName().isEmpty()) {
                System.out.println("Invalid seller name.");
                isValid = false;
            }

            if (amazon.getCategory() == null || amazon.getCategory().isEmpty()) {
                System.out.println("Invalid product category.");
                isValid = false;
            }

            if (!amazon.isInStock()) {
                System.out.println("Product is out of stock.");
                isValid = false;
            }

            return isValid;
        }
    }


