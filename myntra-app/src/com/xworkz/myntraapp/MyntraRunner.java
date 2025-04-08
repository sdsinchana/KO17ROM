package com.xworkz.myntraapp;

public class MyntraRunner {


        public static void main(String[] args) {
            MyntraDto dto = new MyntraDto();

            dto.setBrand("Roadster");
            dto.setProductCategory("Denim Jacket");
            dto.setFabricType("Denim");
            dto.setTargetAudience("Women");
            dto.setDiscountRate(25.5);
            dto.setReturnPolicy(true);

            MyntraApp app = new MyntraApp();
            app.registerProduct(dto);
        }
    }


