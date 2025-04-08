package com.xworkz.zeptoapp;

public class ZeptoApp {


        public void placeOrder(ZeptoDto dto) {
            boolean isValid = isOrderValid(dto);
            if (isValid) {
                System.out.println("Placing order for: " + dto.getItemName() + " from " + dto.getStoreName());

                System.out.println("Category: " + dto.getCategory());
                System.out.println("Quantity: " + dto.getQuantity());

                if (dto.isExpressDelivery()) {
                    System.out.println(" Express delivery selected! Your order will arrive soon.");
                } else {
                    System.out.println(" Standard delivery applied.");
                }

                System.out.println("Total Price: ₹" + dto.getTotalPrice());
            } else {
                System.out.println(" Failed to place order. Please check item details.");
            }
        }

        public boolean isOrderValid(ZeptoDto dto) {
            boolean isValid = true;

            if (dto.getItemName() == null || dto.getItemName().isEmpty()) {
                System.out.println("Item name cannot be empty.");
                isValid = false;
            }

            if (dto.getStoreName() == null || dto.getStoreName().isEmpty()) {
                System.out.println("Store name is required.");
                isValid = false;
            }

            if (dto.getCategory() == null || dto.getCategory().isEmpty()) {
                System.out.println("Item category is missing.");
                isValid = false;
            }

            if (dto.getQuantity() <= 0) {
                System.out.println("Quantity must be greater than zero.");
                isValid = false;
            }

            if (dto.getTotalPrice() < 0) {
                System.out.println("Price cannot be negative.");
                isValid = false;
            }

            return isValid;
        }


}
