package com.example;

public class Main {
    public static void main(String[] args) {
        // constructors and overloaded constructors

        Student std1 = new Student("David", 20, 3.2);
        Student std2 = new Student("Sarah", 22, 3.6);

        std1.study();
        std2.study();

        System.out.println("");

        // overloaded contructors
        User user1 = new User();
        User user2 = new User("David");
        User user3 = new User("Sarah", "sarah@host.com");
        User user4 = new User("John", "john@host.com", 23);

        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.name);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}