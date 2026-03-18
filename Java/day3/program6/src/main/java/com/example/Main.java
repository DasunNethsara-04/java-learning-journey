package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // calculator program

        Scanner scanner = new Scanner(System.in);

        char operator;
        double num1, num2;
        double result = 0;

        System.out.println("Simple Calculator\n");

        System.out.print("Enter Number 1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter Number 2: ");
        num2 = scanner.nextDouble();

        System.out.print("Operation (+, -, /, *, ^): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    // close the scanner instance
                    scanner.close();
                    return;
                }
                result = num1 / num2;
            }

            case '^' -> result = Math.pow(num1, num2);
            default -> System.out.println("Invalid Operator");
        }

        System.out.printf("\n%.2f %s %.2f = %.2f\n", num1, operator, num2, result);

        // close the scanner instance
        scanner.close();
    }
}