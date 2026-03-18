package com.example;

public class Main {
    public static void main(String[] args) {
        // array of objects
        Car[] cars = {
                new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow")
        };
        for (Car car : cars) {
            car.drive();
        }

        System.out.println("");

        for (Car car : cars) {
            car.color = "black";
        }

        System.out.println("");
        
        for (Car car : cars) {
            car.drive();
        }
    }
}