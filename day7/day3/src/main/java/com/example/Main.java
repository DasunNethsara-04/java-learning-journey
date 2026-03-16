package com.example;

public class Main {
    public static void main(String[] args) {
        // aggregation

        Book book1 = new Book("Test Book 1", 576);
        Book book2 = new Book("Test Book 2", 890);
        Book book3 = new Book("Test Book 3", 273);

        Book[] books = { book1, book2, book3 };

        Library library = new Library("NYC Library", 1972, books);

        library.getInfo();

    }
}