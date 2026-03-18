package com.example;

// variables in java
/*
 * There are two types of variables
 * Primitive - simple values stored directly in the memory (stack)
 * Reference - mempry address that points to the heap
 * 
 * Primitive Types -> int, double, boolean, char, ...
 * Reference Types -> string, array, object
*/

public class Main {
    public static void main(String[] args) {

        // primitive types
        int number = 10;
        int age = 21;

        double pi = 3.142;
        double gpa = 2.9987;

        char letter = 'I';
        char grade = 'A';
        char c = '@';

        boolean isStudent = true;
        boolean isLoggedIn = false;

        String name = "David";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");

        if (isStudent) {
            System.out.println("You are a student");
            System.out.println("You got " + grade + " for Physics");
            System.out.println("Your GPA: " + gpa);
        } else {
            System.out.println("You are not a student");
        }
    }
}