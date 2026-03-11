package com.example;

public class Main {
    public static void main(String[] args) {
        // methods in java

        sayHello();
        sayHello();
        int res1 = getSum();
        int res2 = getSumWithArgs(9, 7);

        System.out.println(res1);
        System.out.println(res2);
    }

    static void sayHello() {
        System.out.println("Hello World!");
        System.out.println("I'm learning Java");
    }

    static int getSum() {
        return 5 + 6;
    }

    static int getSumWithArgs(int n1, int n2) {
        return n1 + n2;
    }
}