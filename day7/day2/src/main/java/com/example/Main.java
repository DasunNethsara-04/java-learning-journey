package com.example;

public class Main {
    public static void main(String[] args) {
        // getters and setters
        Car car = new Car("Mustrang", "Red", 59000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

        car.setColor("green");

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}