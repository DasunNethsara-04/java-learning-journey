package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        double total = 0;
        double average = 0;
        ArrayList<Double> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Marks for Student " + (i + 1) + ": ");
            marks.add(scanner.nextDouble());
        }

        System.out.println("");

        for (double mark : marks) {
            total += mark;
        }

        average = total / count;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        scanner.close();
    }
}