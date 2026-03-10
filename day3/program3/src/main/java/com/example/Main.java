package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // simple email slicer and validator program

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter Email: ");
        email = scanner.nextLine();

        // close the scanner instance
        scanner.close();

        // check the email is valid or not
        if (!email.contains("@")) {
            System.out.println("Invalid Email! Must contain a username and domain");
            return;
        }

        // extract the username and the domain
        username = email.substring(0, email.indexOf('@'));
        domain = email.substring(email.indexOf('@') + 1);

        System.out.println("");

        System.out.printf("Username:  %s\n", username);
        System.out.printf("Domain: %s\n", domain);
    }
}