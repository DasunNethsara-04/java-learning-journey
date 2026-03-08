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