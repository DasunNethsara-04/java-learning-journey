package com.example;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // simple rock, paper, scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] items = { "rock", "paper", "scissor" };

        int rounds = 5;
        int player_user = 0;
        int player_pc = 0;
        String user_guess, pc_guess;

        System.out.println("Simple Rock, Paper, Scissor Game");

        while (rounds > 0) {
            // get the pc guess
            pc_guess = items[random.nextInt(0, 3)];

            // get the user's guess
            System.out.print("Enter your guess (rock, paper, scissor): ");
            user_guess = scanner.nextLine().trim().toLowerCase();

            if (user_guess.equals(pc_guess)) {
                System.out.println("Tie!");

            } else if ((user_guess.equals("rock") && pc_guess.equals("scissor")) ||
                    (user_guess.equals("paper") && pc_guess.equals("rock")) ||
                    (user_guess.equals("scissor") && pc_guess.equals("paper"))) {

                System.out.println("You Won!");
                player_user++;

            } else if ((pc_guess.equals("paper") && user_guess.equals("rock")) ||
                    (pc_guess.equals("scissor") && user_guess.equals("paper")) ||
                    pc_guess.equals("rock") && user_guess.equals("scissor")) {

                System.out.println("PC Won!");
                player_pc++;

            } else {
                System.out.println("Invalid Input!");
            }
            rounds--;
        }

        System.out.println("\nGame Over!");
        // select the winner
        if (player_user > player_pc)
            System.out.printf("\nYou Won! (You Got: %d, PC Got: %d)\n", player_user, player_pc);
        else
            System.out.printf("\nYou Failed!(You Got: %d, PC Got: %d)\n", player_user, player_pc);

        // close the scanner instance
        scanner.close();
    }
}