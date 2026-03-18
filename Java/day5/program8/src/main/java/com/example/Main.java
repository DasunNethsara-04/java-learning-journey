package com.example;

public class Main {
    public static void main(String[] args) {
        // method overriding

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}