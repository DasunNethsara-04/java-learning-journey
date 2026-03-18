package com.example;

public class Main {
    public static void main(String[] args) {
        // super keyword -> refers to the parent class
        Person person = new Person("David", "Johns");
        Student student = new Student("Tony", "Stark", 3.9);
        Employee employee = new Employee("Stephen", "Strange", "Doctor");

        person.showName();
        student.showName();
        student.showGpa();
        employee.showJob();
    }
}