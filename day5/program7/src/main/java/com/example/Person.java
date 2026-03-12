package com.example;

public class Person {
    String fName;
    String lName;

    Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    void showName() {
        System.out.println(this.fName + " " + this.lName);
    }
}