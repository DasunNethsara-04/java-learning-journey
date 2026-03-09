package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // simple shopping cart program

        String item;
        double price;
        int qty;
        double total = 0.0;

        // create an instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        // get the user inputs
        System.out.println("Welcome to our shopping store!\n");

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        qty = scanner.nextInt();

        // calculate the total amount
        total = price * qty;

        // disply the result
        System.out.println("You have bought " + qty + " " + item + "/s");
        System.out.println("Your total is $" + total);

        // close the scanner instance
        scanner.close();
    }
}