package com.example;

public class Main {
    public static void main(String[] args) {
        // polymophism
        Boat boat = new Boat();
        Car car = new Car();
        Bick bick = new Bick();

        Vehicle[] vehicles = { boat, car, bick };

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}