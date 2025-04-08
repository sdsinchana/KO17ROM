package com.xworkz.dominosapp;

public class DominosRunner {


        public static void main(String[] args) {
            DominosDto dominos = new DominosDto();

            dominos.setPizzaName("Veggie Paradise");
            dominos.setSize("Medium");
            dominos.setToppings("Corn, Jalapeno, Capsicum");
            dominos.setQuantity(1);
            dominos.setPrice(349.99);
            dominos.setIsDelivery(true);

            DominosApp dominosApp = new DominosApp();
            dominosApp.registerOrder(dominos);
        }
    }


