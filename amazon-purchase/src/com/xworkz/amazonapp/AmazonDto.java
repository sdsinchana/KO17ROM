package com.xworkz.amazonapp;

public class AmazonDto {


        private String productName;
        private double price;
        private int quantity;
        private String sellerName;
        private String category;
        private boolean inStock;

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return productName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setSellerName(String sellerName) {
            this.sellerName = sellerName;
        }

        public String getSellerName() {
            return sellerName;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        public boolean isInStock() {
            return inStock;
        }
    }


