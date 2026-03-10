package com.example;

public class Main {
    public static void main(String[] args) {
        // loops

        // while loop
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("");

        // do-while loop
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        System.out.println("");

        // for loop
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println("");

        // nested loops
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}