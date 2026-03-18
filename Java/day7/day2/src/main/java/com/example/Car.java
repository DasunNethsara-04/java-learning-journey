package com.example;

public class Car {
    private final String model;
    private String color;
    private double price;

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // getters
    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public String getPrice() {
        return "S" + this.price;
    }

    // setters
    public void setColor(final String color) {
        this.color = color;
    }

    public void setPrice(final double price) {
        if (price < 0) {
            System.out.println("Price can't be less than 0");
            return;
        }
        this.price = price;
    }
}