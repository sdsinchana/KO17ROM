package com.xworkz.maxfashionapp;

public class MaxFashionApp {
        MaxFashionDto dto;

        public void registerProduct(MaxFashionDto fashionDto) {
            boolean isvalid = false;
            boolean isValid = isProductValid(fashionDto);
            if (isValid) {
                isvalid = true;
                dto = fashionDto;
                System.out.println("Product listed on MaxFashion successfully!");
            } else {
                System.out.println("Product listing failed. Please check the product details.");
            }
        }

        public boolean isProductValid(MaxFashionDto fashionDto) {
            boolean isValid = true;

            if (fashionDto.getBrandName() == null || fashionDto.getBrandName().isEmpty()) {
                System.out.println("Brand name cannot be empty.");
                isValid = false;
            }

            if (fashionDto.getProductType() == null || fashionDto.getProductType().isEmpty()) {
                System.out.println("Product type must be specified.");
                isValid = false;
            }

            if (fashionDto.getMaterial() == null || fashionDto.getMaterial().isEmpty()) {
                System.out.println("Material must be provided.");
                isValid = false;
            }

            if (fashionDto.getGenderCategory() == null || fashionDto.getGenderCategory().isEmpty()) {
                System.out.println("Please select a valid gender category.");
                isValid = false;
            }

            if (fashionDto.getDiscountPercentage() < 0 || fashionDto.getDiscountPercentage() > 100) {
                System.out.println("Discount percentage should be between 0 and 100.");
                isValid = false;
            }


            if (!fashionDto.isReturnable()) {
                System.out.println("Note: This product is not returnable.");
            }

            return isValid;
        }

        public void fetchDetails(){
            System.out.println("Brand Name :"+dto.getBrandName());
            System.out.println("Product Name :"+dto.getProductType());
            System.out.println("Materials :"+dto.getMaterial());
            System.out.println("Gender Category :"+dto.getGenderCategory());
            System.out.println("Discount Percentage :"+dto.getDiscountPercentage());
            System.out.println("Returnable :"+dto.isReturnable());
        }
    }


