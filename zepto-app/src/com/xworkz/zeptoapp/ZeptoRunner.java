package com.xworkz.zeptoapp;

public class ZeptoRunner {


        public static void main(String[] args) {
            ZeptoDto dto = new ZeptoDto();

            dto.setItemName("Organic Apples");
            dto.setStoreName("Fresh Farm Market");
            dto.setCategory("Fruits");
            dto.setQuantity(2);
            dto.setExpressDelivery(true);
            dto.setTotalPrice(320.50);

            ZeptoApp app = new ZeptoApp();
            app.placeOrder(dto);
            app.fetchDetails();
        }


}
