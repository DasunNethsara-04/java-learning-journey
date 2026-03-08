# Java Learning Journey

My whole journey of learning Java Programming language.

## Tools
* Visual Studio Code + `Extention pack for Java`

## My Journey
### Day 1
1. Installed the JVM into my computer with VS Code and ran the first `Hello World` program.

    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // This is my first Java program...
            System.out.println("Hello World");
        }
    }
    ```

2. Learnt about Variables in Java and types of variables.
    * Primitive Types -> Simple values stored directly in memory (`stack`)
        > ex: `int`, `double`, `char`, `boolean`
    
    * Reference Types -> Memory address that point to the `heap`
        > ex: `String`, `array`, `object`

    ```java
    package com.example;
    public class Main {
        public static void main(String[] args) {
            // primitive types
            int number = 10;
            int age = 21;

            double pi = 3.142;
            double gpa = 2.9987;

            char letter = 'I';
            char grade = 'A';
            char c = '@';

            boolean isStudent = true;
            boolean isLoggedIn = false;

            // reference types
            String name = "David";
        }
    }
    ```

3. Learnt how to work with built-in `Scanner` class to get user inputs
    ```java
    package com.example;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            // create a instance of Scanner
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Name: ");

            // nextLine() reads the whole line
            // but the next() read till a space.
            String name = scanner.nextLine();

            Syste.out.println("Welcome back, " + name + "!");
        }
    }
    ```

    We can take inputs for other types also.
    ```java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // to read integers
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // to read doubles
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("You are " + age + " years old!");
        System.out.println("Your GPA is " + gpa + " !");
    }
    ```