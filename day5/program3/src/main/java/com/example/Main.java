package com.example;

public class Main {
    public static void main(String[] args) {
        // constructors

        Student std1 = new Student("David", 20, 3.2);
        Student std2 = new Student("Sarah", 22, 3.6);

        std1.study();
        std2.study();
    }
}