package com.example;

public class Book {
    private final String name;
    private final int pages;

    public Book(final String name, final int pages) {
        this.name = name;
        this.pages = pages;
    }

    public void getInfo() {
        System.out.println(this.name + " (" + this.pages + ")");
    }
}
