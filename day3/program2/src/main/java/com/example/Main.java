package com.example;

public class Main {
    public static void main(String[] args) {
        // string methods

        String name = "david johns";

        // get the length of a string
        int length = name.length(); // => 5

        // get the letter of a string of a specific index
        char letter = name.charAt(2); // => 'v'

        // get the first index of a string of a specific character
        int index = name.indexOf('i'); // => 3

        // get the last index of a string of a specific character
        int lastIndex = name.lastIndexOf('d'); // => 4

        // change letters to uppercase
        name = name.toUpperCase();

        // change letters to lowercase
        name = name.toLowerCase();

        // trim the string (remove additional whitespaces)
        name = name.trim();

        // replace one character with another
        name = name.replace('a', 'o'); // => dovid
        name = name.replace('d', 'c'); // => covic

        // check if the string is empty
        if (name.isEmpty())
            System.out.println("name is empty");
        else
            System.out.printf("Hello %s\n", name);

        // check the string contains a specific character sequance
        if (name.contains(" "))
            System.out.println("your name contains a space");
        else
            System.out.println("Your name doesn't contain any space");

        // check the two strings are equal
        String password = "Password";
        if (password.equals("password"))
            System.out.println("Welcome");
        else
            System.out.println("incorrect password");

        // chech two stringsare equal (ignoring the cases)
        if (password.equalsIgnoreCase("password"))
            System.out.println("Welcome");
        else
            System.out.println("incorrect password");

        System.out.println("\n\n");

        /* === SUBSTRINGS === */

        String email = "david@host.com";
        String username = email.substring(0, 5); // => david
        String domain = email.substring(6); // => gmail.com
        System.out.println(username);
        System.out.println(domain);

        System.out.println("");

        // more flexible approach
        username = email.substring(0, email.indexOf('@'));
        domain = email.substring(email.indexOf('@') + 1);
        System.out.println(username);
        System.out.println(domain);
    }
}