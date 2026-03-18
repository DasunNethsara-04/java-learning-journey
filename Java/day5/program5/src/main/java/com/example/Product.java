package com.example;

public class Product {
    static int productCount;
    String productName;

    Product(String name) {
        this.productName = name;
        productCount++;
    }

    static void showProductCount() {
        System.out.println("Product Count: " + productCount);
    }
}
