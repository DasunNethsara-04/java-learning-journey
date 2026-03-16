package com.example;

public class Engine {
    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(this.type + " engine is starting!");
    }
}