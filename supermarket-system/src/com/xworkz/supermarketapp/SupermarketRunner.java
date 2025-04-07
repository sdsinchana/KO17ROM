package com.xworkz.supermarketapp;
import com.xworkz.supermarketapp.supermarket.supermarket;
import com.xworkz.supermarketapp.product.Products;

public class SupermarketRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        String[] storeBranches = {"BTM Layout", "Whitefield", "HSR Layout"};
        String[] ingredientsForSoap = {"Sodium", "Perfume", "Glycerin"};
        String[] ingredientsForBiscuits = {"Wheat", "Sugar", "Butter", "Salt"};

        // Product class details:-
        Products[] products = new Products[2];

        Products product1 = new Products();
        product1.productId = 101;
        product1.productName = "Soap";
        product1.ingredients = ingredientsForSoap;
        product1.productPrice = 25.00;

        Products product2 = new Products();
        product2.productId = 102;
        product2.productName = "Biscuits";
        product2.ingredients = ingredientsForBiscuits;
        product2.productPrice = 35.00;

        products[0] = product1;
        products[1] = product2;

        product1.productDetails();
        product2.productDetails();

        // Supermarket class details:-
        supermarket supermarket = new supermarket();
        supermarket.storeId = 1;
        supermarket.storeName = "FreshMart";
        supermarket.storeLocation = "Malleshwaram";
        supermarket.storeBranches = storeBranches;
        supermarket.products = products;

        supermarket.storeDetails();

        System.out.println("Main Ended");
    }
}

