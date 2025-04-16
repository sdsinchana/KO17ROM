package com.xworkz.maxfashionapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MaxFashionDto {


        private String brandName;
        private String productType; // e.g., T-shirt, Jeans, Dress
        private String material; // e.g., Cotton, Polyester
        private String genderCategory; // e.g., Men, Women, Kids
        private double discountPercentage;
        private boolean isReturnable;

      /*  public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public String getProductType() {
            return productType;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setGenderCategory(String genderCategory) {
            this.genderCategory = genderCategory;
        }

        public String getGenderCategory() {
            return genderCategory;
        }

        public void setDiscountPercentage(double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public double getDiscountPercentage() {
            return discountPercentage;
        }

        public void setReturnable(boolean isReturnable) {
            this.isReturnable = isReturnable;
        }

        public boolean getReturnable() {
            return isReturnable;
        }


       */

}


