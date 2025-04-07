package com.xworkz.supermarketapp.supermarket;

import com.xworkz.supermarketapp.product.Products;

public class supermarket {
    public int storeId;
    public String storeName;
    public String storeLocation;
    public String[] storeBranches;
    public Products[] products;

    public void storeDetails() {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.print("Branches: ");
        for (String branch : storeBranches) {
            System.out.print(branch + " ");
        }
        System.out.println("\n--- Products Available ---");
        for (Products product : products) {
            product.productDetails();
        }
    }
}

