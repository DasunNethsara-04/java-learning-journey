package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal_amount;
        double interest_rate;
        int compound_times;
        int years;
        double amount = 0;

        System.out.println("Compund Interest Calculator\n");

        System.out.print("Enter the principal amount: ");
        principal_amount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interest_rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compound per year: ");
        compound_times = scanner.nextInt();

        System.out.print("Enter the # of year: ");
        years = scanner.nextInt();

        amount = principal_amount * Math.pow((1 + (interest_rate / compound_times)), (compound_times * years));

        System.out.printf("\nThe amount after %d years is $%,.2f\n", years, amount);

        // close the Scanner instance
        scanner.close();
    }
}