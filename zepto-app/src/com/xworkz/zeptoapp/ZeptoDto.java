package com.xworkz.zeptoapp;

public class ZeptoDto {


        private String itemName;
        private String storeName;
        private String category; // e.g., Dairy, Vegetables, Snacks
        private int quantity; // in units or weight
        private boolean expressDelivery;
        private double totalPrice;

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return itemName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setExpressDelivery(boolean expressDelivery) {
            this.expressDelivery = expressDelivery;
        }

        public boolean isExpressDelivery() {
            return expressDelivery;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        public double getTotalPrice() {
            return totalPrice;
        }


}
