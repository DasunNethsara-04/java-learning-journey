package com.example;

public class Main {
    public static void main(String[] args) {
        // logical operators
        // && - logical AND
        // || - logical OR
        // ! - logical NOT

        double temp = 20;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is sunney outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is cloudy outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad!");
        }
    }
}