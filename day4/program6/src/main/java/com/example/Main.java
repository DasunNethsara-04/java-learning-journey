package com.example;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        // simple dice roller game
        Scanner scanner = new Scanner(System.in);

        int diceCount = 0;

        while (diceCount < 1) {
            System.out.print("Enter the number of dice to roll: ");
            diceCount = scanner.nextInt();
        }
        roll(diceCount);

        // close the scanner instance
        scanner.close();
    }

    static void roll(int diceCount) {
        System.out.println("Rolling " + diceCount + " dice...");

        int randomNum;
        int total = 0;
        for (int i = 0; i < diceCount; i++) {
            randomNum = random.nextInt(1, 7);
            System.out.println("\nYou rolled: " + randomNum + "\n");

            // show the ASCII dice
            showDice(randomNum);

            // calculate the total
            total += randomNum;
        }
        System.out.println("Total of all rolls: " + total);
    }

    static void showDice(int number) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ● ● ● |
                |       |
                | ● ● ● |
                 -------
                """;

        switch (number) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }
    }
}