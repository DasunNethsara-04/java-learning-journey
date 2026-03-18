package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Quiz Game
        Scanner scanner = new Scanner(System.in);

        String questions[] = {
                "Who invented the Git?",
                "What is not a programming language?",
                "React.js developed by?",
                "Who invented the Python programming language?",
                "Which language doesn't use in Operating System Development?"
        };

        String options[][] = {
                { "Bill Gates", "Mark Zuckerbergs", "Linus Torvalds", "Ken Thopmson" },
                { "Java", "HTML", "Rust", "JS" },
                { "Microsoft", "Meta (Facebook)", "Apple", "Google" },
                { "Guido Van Rossum", "Dennis Ritchie", "James Gosline", "Tony Stark" },
                { "Assembly", "C", "CSS", "Rust", }
        };
        int answers[] = { 3, 2, 2, 1, 3 };

        int choice;
        int total = 0;

        String correctStr = """
                *********
                 CORRECT
                *********\n
                """;
        String wrongStr = """
                *********
                  WRONG
                *********\n
                """;

        System.out.println("*********************");
        System.out.println("Welcome to Quiz Game!");
        System.out.println("*********************");

        for (int i = 0; i < questions.length; i++) {
            System.out.printf("%s\n", questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(j + 1 + ". " + options[i][j]);
            }

            System.out.print("Your Answer (1 - 4): ");
            choice = scanner.nextInt();

            // check if the answer is correct, if yes, increment the total by 1
            if (choice == answers[i]) {
                total++;
                System.out.println(correctStr);
            } else {
                System.out.println(wrongStr);
            }
        }

        System.out.println("**********************************");
        System.out.printf("Your final score is: %d out of %d\n", total, questions.length);
        System.out.println("**********************************");

        // close the scanner instance
        scanner.close();
    }
}