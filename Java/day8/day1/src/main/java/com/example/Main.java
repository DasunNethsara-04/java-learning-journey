package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1;
        int number2;
        int result;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Number 1: ");
            number1 = scanner.nextInt();
            System.out.print("Enter Number 2: ");
            number2 = scanner.nextInt();

            result = number1 / number2;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("This is not a number!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Done");
        }
    }
}