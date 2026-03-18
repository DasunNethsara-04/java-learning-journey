package com.example;

public class Library {
    private final String name;
    private final int year;
    private Book[] books;

    public Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void getInfo() {
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Available Books: ");
        for (Book book : books) {
            book.getInfo();
        }
    }

}
