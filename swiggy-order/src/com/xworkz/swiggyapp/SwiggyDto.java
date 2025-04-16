package com.xworkz.swiggyapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SwiggyDto {


        private String restaurantName;
        private String foodItem;
        private String cuisineType; // e.g., Indian, Chinese, Italian
        private String deliveryLocation;
        private double price;
        private boolean isVeg;

     /*   public void setRestaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
        }

        public String getRestaurantName() {
            return restaurantName;
        }

        public void setFoodItem(String foodItem) {
            this.foodItem = foodItem;
        }

        public String getFoodItem() {
            return foodItem;
        }

        public void setCuisineType(String cuisineType) {
            this.cuisineType = cuisineType;
        }

        public String getCuisineType() {
            return cuisineType;
        }

        public void setDeliveryLocation(String deliveryLocation) {
            this.deliveryLocation = deliveryLocation;
        }

        public String getDeliveryLocation() {
            return deliveryLocation;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setVeg(boolean isVeg) {
            this.isVeg = isVeg;
        }

        public boolean getIsVeg() {
            return isVeg;
        }

      */
    }


