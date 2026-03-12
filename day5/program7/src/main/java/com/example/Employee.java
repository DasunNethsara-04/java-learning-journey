package com.example;

public class Employee extends Person {
    String job;

    Employee(String fName, String lName, String job) {
        super(fName, lName);
        this.job = job;
    }

    void showJob() {
        System.out.println(this.fName + " is a " + this.job);
    }
}
