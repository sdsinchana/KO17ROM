package com.xworkz.myntraapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyntraDto {

        private String brand;
        private String productCategory;
        private String fabricType;
        private String targetAudience;
        private double discountRate;
        private boolean returnPolicy;

    /*    public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public void setFabricType(String fabricType) {
            this.fabricType = fabricType;
        }

        public String getFabricType() {
            return fabricType;
        }

        public void setTargetAudience(String targetAudience) {
            this.targetAudience = targetAudience;
        }

        public String getTargetAudience() {
            return targetAudience;
        }

        public void setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
        }

        public double getDiscountRate() {
            return discountRate;
        }

        public void setReturnPolicy(boolean returnPolicy) {
            this.returnPolicy = returnPolicy;
        }

        public boolean getIsReturnPolicy() {
            return returnPolicy;
        }

     */
    }


