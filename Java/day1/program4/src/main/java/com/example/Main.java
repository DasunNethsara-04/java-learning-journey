package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        // get the user inputs
        System.out.print("Enter an adjective (adjective): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        noun = scanner.nextLine();

        System.out.print("Enter an adjective (adjective): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb end with -ing (action): ");
        verb = scanner.nextLine();

        System.out.print("Enter an adjective (adjective): ");
        adjective3 = scanner.nextLine();

        // display the inputs with the story
        System.out.println("");
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun + ".");
        System.out.println(noun + " was " + adjective2 + " and " + verb + "!");
        System.out.println("I was " + adjective3 + "!");

        // close the scanner instance
        scanner.close();
    }
}