package com.example;

public abstract class Shape {
    abstract double area(); // ABSTRACT

    // CONCRETE
    void display() {
        System.out.println("This is a shape!");
    }
}
