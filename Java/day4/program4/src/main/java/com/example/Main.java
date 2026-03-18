package com.example;

public class Main {
    public static void main(String[] args) {
        // overloaded methods -> methods that shares the same name,
        // but different parameters
        // signature = name + parameters

        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 6));
    }

    static double add(double n1, double n2) {
        return n1 + n2;
    }

    static double add(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }
}