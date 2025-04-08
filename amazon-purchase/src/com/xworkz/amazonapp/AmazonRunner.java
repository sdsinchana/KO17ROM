package com.xworkz.amazonapp;

public class AmazonRunner {

    public static void main(String[] args) {
        AmazonDto amazon = new AmazonDto();

        amazon.setProductName("Wireless Mouse");
        amazon.setPrice(899.99);
        amazon.setQuantity(2);
        amazon.setSellerName("TechGadgets");
        amazon.setCategory("Electronics");
        amazon.setInStock(true);

        AmazonApp amazonOrder = new AmazonApp();
        amazonOrder.registerOrder(amazon);
    }
}


