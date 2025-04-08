package com.xworkz.myntraapp;

public class MyntraApp {

        public void registerProduct(MyntraDto dto) {
            boolean isValid = isProductValid(dto);
            if (isValid) {
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
                System.out.println("Please specify the target audience (e.g., Men, Women, Kids).");
                isValid = false;
            }

            if (dto.getDiscountRate() < 0 || dto.getDiscountRate() > 100) {
                System.out.println("Discount rate should be between 0% and 100%.");
                isValid = false;
            }

            // Optional info
            if (!dto.isReturnPolicy()) {
                System.out.println("Note: This product is not eligible for return.");
            }

            return isValid;
        }
    }


