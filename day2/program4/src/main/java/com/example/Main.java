package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // create a instance of Random class
        Random random = new Random();

        // save random integers
        int number1;

        // save random doubles
        double number2;

        // save random bool value
        boolean state;

        // get a random int
        number1 = random.nextInt(1, 7);

        // get a random double
        number2 = random.nextDouble(1, 100);

        // get a random boolean
        state = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(state);
    }
}