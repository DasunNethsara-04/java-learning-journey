package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // runtime polymorphism

        Animal animal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wich animal do you like most? (1 - Dog, 2 - Cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

        scanner.close();
    }
}