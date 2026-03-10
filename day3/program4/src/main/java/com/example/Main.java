package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // weight convertion program

        Scanner scanner = new Scanner(System.in);
        int choice;
        double input;
        double result = 0;

        System.out.println("Weight Convertion Program\n");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option (1 or 2): ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            input = scanner.nextDouble();

            // 1pound (1lbs) = 0.4535924kg
            result = input * 0.4535924;

            System.out.printf("%,.3flbs = %,.3fkg\n", input, result);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            input = scanner.nextDouble();

            // 1kg = 2.204623lbs
            result = input * 2.204623;

            System.out.printf("%,.3fkg = %,.3flbs\n", input, result);
        } else {
            System.out.println("Invalid Choice.");
            // close the scanner before exiting the program
            scanner.close();

            return;
        }

        // close the scanner
        scanner.close();
    }
}