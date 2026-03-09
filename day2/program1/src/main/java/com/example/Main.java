package com.example;

public class Main {
    public static void main(String[] args) {
        // ARITHMETIC OPERATORS
        int a = 10;
        int b = 2;

        a = a + b; // equals to: a += b
        a = a - b; // equals to: a -= b
        a = a * b; // equals to: a *= b
        a = a / b; // equals to: a /= b
        a = a % b; // equals to: a %= b

        // increment operators
        int c = 5;

        ++c; // equals to c = c + 1 => c += 1 => Answer: 6

        c++; // Answer: 7

        --c; // equals to c = c - 1 => c -= 1 => Answer: 6

        c--; // Answer: 5

        // System.out.println(c);

        /*
         * Pre Increment (++var) => increment, then assign
         * Post Increment (var++) => assign, then increment
         * Same as Pre/ Post Decrement
         */

        // ORDER OF OPERATIONS
        double result = 3 + 4 * (7 - 5) / 2.0;
        // 3 + 4 * 2 / 2.0
        // 3 + 8 / 2.0
        // 3 + 4.0
        // 7.0

        System.out.println(result);
    }
}