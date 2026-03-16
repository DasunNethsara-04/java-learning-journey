package com.example;

public class Car {
    private final String model;
    private final int year;
    private final Engine engine;

    public Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public void start() {
        this.engine.start();
        System.out.println(this.model + " is staring!");
    }
}