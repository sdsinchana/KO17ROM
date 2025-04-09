package com.xworkz.dominosapp;

public class DominosDto {


        private String pizzaName;
        private String size;
        private String toppings;
        private int quantity;
        private double price;
        private boolean isDelivery;

        public void setPizzaName(String pizzaName) {
            this.pizzaName = pizzaName;
        }

        public String getPizzaName() {
            return pizzaName;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setToppings(String toppings) {
            this.toppings = toppings;
        }

        public String getToppings() {
            return toppings;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setIsDelivery(boolean isDelivery) {
            this.isDelivery = isDelivery;
        }

        public boolean getIsDelivery() {
            return isDelivery;
        }
    }


