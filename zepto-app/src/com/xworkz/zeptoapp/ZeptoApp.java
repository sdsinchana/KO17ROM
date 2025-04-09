package com.xworkz.zeptoapp;

public class ZeptoApp {
ZeptoDto dto;

        public void placeOrder(ZeptoDto dto) {
            boolean isvalid;
            boolean isValid = isOrderValid(dto);
            if (isValid) {
                isvalid = true;
                this.dto = dto;
                System.out.println("Placing order for customer from Zepto" );
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
        public  void fetchDetails(){
            System.out.println("Item Name :"+dto.getItemName());
            System.out.println("Store Name :"+dto.getStoreName());
            System.out.println("Category :"+dto.getCategory());
            System.out.println("Quantity :"+dto.getQuantity());
            System.out.println("Total Price :"+dto.getTotalPrice());

        }

}
