package com.example;

public class Main {
    public static void main(String[] args) {
        // printf
        String name = "David";
        int age = 22;

        System.out.printf("Hello %s!, You are %d years old.\n", name, age);

        // precision
        double res = 10 / 3.0;
        double num1 = 15.3;
        double num2 = 3.142;
        double num3 = 1565488.454848;

        System.out.println(res);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.printf("%.2f\n", res);
        System.out.printf("%.5f\n", num1);
        System.out.printf("%.3f\n", num2);

        System.out.printf("%,.3f\n", num3);

        // width
        int id1 = 1;
        int id2 = 23;
        int id3 = 107;
        int id4 = 4584;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
    }
}