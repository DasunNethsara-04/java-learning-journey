package com.example;

import java.util.Scanner;

public class Main {

    // account balance
    static double balance = 0.0;

    public static void main(String[] args) {
        // simple banking system program

        Scanner scanner = new Scanner(System.in);

        int choice;
        double amount;
        while (true) {
            showScreen();

            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance();
                case 2 -> {
                    System.out.print("\nEnter Amount: ");
                    amount = scanner.nextDouble();
                    deposit(amount);
                }
                case 3 -> {
                    System.out.print("\nEnter Amount: ");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                }
                case 4 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> {
                    System.out.println("Invalid Choice.");
                    return;
                }
            }

            // close the scanner instance
            scanner.close();
        }
    }

    static void showBalance() {
        System.out.println("");
        System.out.printf("Available Balance: $%,.3f\n", balance);
    }

    static void deposit(double amount) {
        balance += amount;
        System.out.println("\nCash deposited.");
        System.out.printf("Current Balance: $%,.3f\n", balance);
    }

    static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("\ninsufficient account balance!");
            return;
        }
        balance -= amount;
        System.out.println("\nCash Withdrawed.");
        System.out.printf("Current Balance: $%,.3f\n", balance);
    }

    static void showScreen() {
        System.out.println("\n***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
}