package com.xworkz.maxfashionapp;

public class MaxFashionRunner {


        public static void main(String[] args) {
            MaxFashionDto fashionDto = new MaxFashionDto();

            fashionDto.setBrandName("Max");
            fashionDto.setProductType("Casual Shirt");
            fashionDto.setMaterial("Cotton");
            fashionDto.setGenderCategory("Men");
            fashionDto.setDiscountPercentage(15.0);
            fashionDto.setReturnable(true);

            MaxFashionApp fashionApp = new MaxFashionApp();
            fashionApp.registerProduct(fashionDto);
            fashionApp.fetchDetails();
        }
    }


