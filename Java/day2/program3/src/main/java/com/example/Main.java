package com.example;

public class Main {
    public static void main(String[] args) {
        // if statements
        int age = 12;

        if (age >= 60) {
            System.out.println("You are a senior");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else {
            System.out.println("You are an child!");
        }
    }
}