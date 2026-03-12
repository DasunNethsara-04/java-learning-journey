package com.example;

public class User {
    String name;
    String email;
    int age;

    User() {
        this.name = "Annonymous User";
        this.email = "N/A";
        this.age = 0;
    }

    User(String name) {
        this.name = name;
        this.email = "N/A";
        this.age = 0;
    }

    User(String name, String email) {
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
