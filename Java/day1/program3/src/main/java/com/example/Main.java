package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");
        System.out.println("Your GPA is " + gpa + " !");

        System.out.println("\n=================================\n");

        double width, height, area = 0.0;
        System.out.println("Rectangle Area Calculator\n");

        System.out.print("Enter Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter Hight: ");
        height = scanner.nextDouble();

        // calculating the area of a rectangle
        area = width * height;

        System.out.println("Area: " + area + " units");

        scanner.close();
    }
}