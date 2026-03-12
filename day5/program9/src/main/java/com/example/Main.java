package com.example;

public class Main {
    public static void main(String[] args) {
        // abstraction - the process of hiding the implementation details

        // Shape shape = new Shape(); <- not possible

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(5, 6);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}