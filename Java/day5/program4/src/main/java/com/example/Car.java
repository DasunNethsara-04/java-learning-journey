package com.example;

public class Car {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You are driving a " + this.color + " " + this.model);
    }
}
