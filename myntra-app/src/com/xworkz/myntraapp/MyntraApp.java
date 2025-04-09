package com.xworkz.myntraapp;

public class MyntraApp {
MyntraDto dto;
        public void registerProduct(MyntraDto dto) {
            boolean isvalid = false;
            boolean isValid = isProductValid(dto);
            if (isValid) {
                isvalid = true;
                this.dto = dto;
                System.out.println("Product listed on Myntra successfully!");
            } else {

                System.out.println("Product listing failed. Please verify product information.");
            }
        }

        public boolean isProductValid(MyntraDto dto) {
            boolean isValid = true;

            if (dto.getBrand() == null || dto.getBrand().isEmpty()) {
                System.out.println("Brand cannot be empty.");
                isValid = false;
            }

            if (dto.getProductCategory() == null || dto.getProductCategory().isEmpty()) {
                System.out.println("Product category must be specified.");
                isValid = false;
            }

            if (dto.getFabricType() == null || dto.getFabricType().isEmpty()) {
                System.out.println("Fabric type must be provided.");
                isValid = false;
            }

            if (dto.getTargetAudience() == null || dto.getTargetAudience().isEmpty()) {
                System.out.println("Please specify the target audience .");
                isValid = false;
            }

            if (dto.getDiscountRate() < 0 || dto.getDiscountRate() > 100) {
                System.out.println("Discount rate should be between 0% and 100%.");
                isValid = false;
            }

            // Optional info
            if (!dto.getIsReturnPolicy()) {
                System.out.println("Note: This product is not eligible for return.");
            }

            return isValid;
        }
    public void fetchDetails(){
        System.out.println("Brand :"+dto.getBrand());
        System.out.println("Product Category :"+dto.getProductCategory());
        System.out.println("Fabric Type :"+dto.getFabricType());
        System.out.println("Target Audience :"+dto.getTargetAudience());
        System.out.println("Discount Rate :"+dto.getDiscountRate());
        System.out.println("Return Policy :"+dto.getIsReturnPolicy());

    }
}


