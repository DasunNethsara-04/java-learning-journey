package com.example;

public class Student extends Person {
    double gpa;

    Student(String fName, String lName, double gpa) {
        super(fName, lName);
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println(this.fName + "'s GPA is " + this.gpa);
    }
}
