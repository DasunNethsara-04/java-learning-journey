package com.example;

public class Main {
    public static void main(String[] args) {
        // interfaces

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}