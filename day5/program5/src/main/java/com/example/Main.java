package com.example;

public class Main {
    public static void main(String[] args) {
        // static keyword

        Product p1 = new Product("iPhone 11");
        Product p2 = new Product("MacBook Pro");
        Product p3 = new Product("iPad");

        System.out.println("Products Count: " + Product.productCount);
        Product.showProductCount();
    }
}