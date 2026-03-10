package com.example;

public class Main {
    public static void main(String[] args) {
        // enhanced switch statement

        String day = "Saturday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thrsday", "Friday" ->
                System.out.println("It is a Weekday");

            case "Saturday", "Sunday" ->
                System.out.println("It is the weekend");

            default -> System.out.printf("%s is not a day\n", day);
        }
    }
}