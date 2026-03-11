package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arrays

        String[] names = { "David", "Steve", "Sarah", "John" };

        System.out.println(names[1]);

        names[1] = "Tony";

        System.out.println(names[1]);

        System.out.println("Array Length: " + names.length);

        // sorting an array
        Arrays.sort(names);

        // typical for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        System.out.println("");

        // enhanced for loop (for each loop)
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // String[] foods = new String[5]; // another method to initialize an array

        // for (int i = 0; i < 5; i++) {
        // System.out.print("Enter Food: ");
        // foods[i] = scanner.nextLine();
        // }

        // for (String food : foods) {
        // System.out.println("Foods: " + food);
        // }

        scanner.close();

        /* Variable Arguments */
        int tot = sum(7, 8, 6, 4, 3, 4, 6);
        System.out.println(tot);

        /* 2D Arrays */
        String[][] groceries = {
                { "apple", "orange", "banana" },
                { "potato", "onion", "carrot" },
                { "chicken", "pork", "beef", "fish" }
        };

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println("");
        }
    }

    static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}