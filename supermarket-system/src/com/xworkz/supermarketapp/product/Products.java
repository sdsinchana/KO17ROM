package com.xworkz.supermarketapp.product;

public class Products {
    public int productId;
    public String productName;
    public String[] ingredients;
    public double productPrice;

    public void productDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.print("Ingredients: ");
        for (String item : ingredients) {
            System.out.print(item + " ");
        }
        System.out.println("Product Price: " + productPrice);

    }
}

