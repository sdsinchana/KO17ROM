package com.xworkz.amazonapp;

public class AmazonRunner {


    public static void main(String[] args) {
        AmazonDto amazonDto = new AmazonDto();
        amazonDto.setFullName("Sinchana_Sd");
        amazonDto.setMobileNumber("7676496955");
        amazonDto.setEmail("sinchana@gmail.com");
        amazonDto.setPassword("sinchu@123");
        amazonDto.setShippingAddress("Bengaluru, India");

        AmazonApp amazonApp = new AmazonApp();
        amazonApp.UserRegistered(amazonDto);
        amazonApp.fetchDetails();
    }
}


