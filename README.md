# Java Learning Journey

My whole journey of learning Java Programming language.

## Tools
* Visual Studio Code + `Extention pack for Java`

## My Journey
### Day 1
1. Installed the JVM into my computer with VS Code and ran the first `Hello World` program.

    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // This is my first Java program...
            System.out.println("Hello World");
        }
    }
    ```

2. Learnt about Variables in Java and types of variables.
    * Primitive Types -> Simple values stored directly in memory (`stack`)
        > ex: `int`, `double`, `char`, `boolean`
    
    * Reference Types -> Memory address that point to the `heap`
        > ex: `String`, `array`, `object`

    ```java
    package com.example;
    public class Main {
        public static void main(String[] args) {
            // primitive types
            int number = 10;
            int age = 21;

            double pi = 3.142;
            double gpa = 2.9987;

            char letter = 'I';
            char grade = 'A';
            char c = '@';

            boolean isStudent = true;
            boolean isLoggedIn = false;

            // reference types
            String name = "David";
        }
    }
    ```

3. Learnt how to work with built-in `Scanner` class to get user inputs
    ```java
    package com.example;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            // create a instance of Scanner
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Name: ");

            // nextLine() reads the whole line
            // but the next() read till a space.
            String name = scanner.nextLine();

            Syste.out.println("Welcome back, " + name + "!");

            // close the scanner
            scanner.close();
        }
    }
    ```

    We can take inputs for other types also.
    ```java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // to read integers
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // to read doubles
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("You are " + age + " years old!");
        System.out.println("Your GPA is " + gpa + " !");
        scanner.close();
    }
    ```

4. Implemented a simple game called "Mad Libs Game" to practice user inputs and strings well.
---

### Day 2
1. Learnt about Arithmetic Operators, Assignment Operators and Increment/ Decrement operators in Java.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            int a = 10;
            int b = 2;

            a = a + b; // equals to: a += b
            a = a - b; // equals to: a -= b
            a = a * b; // equals to: a *= b
            a = a / b; // equals to: a /= b
            a = a % b; // equals to: a %= b

            // increment operators
            int c = 5;

            ++c; // equals to c = c + 1 => c += 1 => Answer: 6
            c++; // Answer: 7
            --c; // equals to c = c - 1 => c -= 1 => Answer: 6
            c--; // Answer: 5

            // System.out.println(c);

            /*
            * IMPORTANT NOTE
            * Pre Increment (++var) => increment, then assign
            * Post Increment (var++) => assign, then increment
            * Same as Pre/ Post Decrement
            */


            // ORDER OF OPERATIONS
            double result = 3 + 4 * (7 - 5) / 2.0;
                        // 3 + 4 * 2 / 2.0
                        // 3 + 8 / 2.0
                        // 3 + 4.0
                        // 7.0

            System.out.println(result);
        }
    }
    ```

2. Implemented a simple shopping cart program to test my knowledge about I/O, arithmetic operators.

3. Learnt how to use if statements in Java
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // if statements
            int age = 12;

            if (age >= 60) {
                System.out.println("You are a senior");
            } else if (age >= 18) {
                System.out.println("You are an adult!");
            } else if (age < 0) {
                System.out.println("You haven't been born yet!");
            } else {
                System.out.println("You are an child!");
            }
        }
    }
    ```

4. Learnt about the `Random` class to generate random numbers in Java.
    ```java
    package com.example;

    import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            // create a instance of Random
            Random random = new Random();

            int number1;    // save random integers
            double number2; // save random doubles
            boolean state;  // save random bool value

            // get a random int
            number1 = random.nextInt(1, 7);

            // get a random double
            number2 = random.nextDouble(1, 100);

            // get a random boolean
            state = random.nextBoolean();

            System.out.println(number1);
            System.out.println(number2);
            System.out.println(state);
        }
    }
    ```

5. Learnt how to use `printf`.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            String name = "David";
            int age = 31;

            System.out.printf("Hello %s! You are %d years old.\n", name, age);


            // precision
            double res = 10 / 3.0;
            System.out.printf("%.2f");

            // width
            int id1 = 1;
            int id2 = 23;
            int id3 = 107;
            int id4 = 4584;

            System.out.printf("%04d\n", id1);
            System.out.printf("%04d\n", id2);
            System.out.printf("%04d\n", id3);
            System.out.printf("%04d\n", id4);

        }
    }
    ```

### Day 3
1. Built a compound interest calculator in Java to test the knowledge about `I/O`, `Math` class and `printf`.

2. Learnt about the string methods in Java.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            String name = "david johns";

            // get the length of a string
            int length = name.length(); // => 5

            // get the letter of a string of a specific index
            char letter = name.charAt(2); // => 'v'

            // get the first index of a string of a specific character
            int index = name.indexOf('i'); // => 3

            // get the last index of a string of a specific character
            int lastIndex = name.lastIndexOf('d'); // => 4

            // change letters to uppercase
            name = name.toUpperCase();

            // change letters to lowercase
            name = name.toLowerCase();

            // trim the string (remove additional whitespaces)
            name = name.trim();

            // replace one character with another
            name = name.replace('a', 'o'); // => dovid
            name = name.replace('d', 'c'); // => covic

            // check if the string is empty
            if (name.isEmpty())
                System.out.println("name is empty");
            else
                System.out.printf("Hello %s\n", name);

            // check the string contains a specific character sequance
            if (name.contains(" "))
                System.out.println("your name contains a space");
            else
                System.out.println("Your name doesn't contain any space");

            // check the two strings are equal
            String password = "Password";
            if (password.equals("password"))
                System.out.println("Welcome");
            else
                System.out.println("incorrect password");

            // chech two stringsare equal (ignoring the cases)
            if (password.equalsIgnoreCase("password"))
                System.out.println("Welcome");
            else
                System.out.println("incorrect password");
            }



            /* === SUBSTRINGS === */

            String email = "david@host.com";
            String username = email.substring(0, 5); // => david
            String domain = email.substring(6); // => gmail.com
            System.out.println(username);
            System.out.println(domain);
    }
    ```

3. Built a simple email slicer and validator program.
4. Built a simple weight conversion program.

5. Learnt about the Enhanced Switch statement.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            String day = "Monday";

            switch (day) {
                case "Monday" -> System.out.println("It is a weeday");
                case "Tuesday" -> System.out.println("It is a weeday");
                case "Wednesday" -> System.out.println("It is a weeday");
                case "Thursday" -> System.out.println("It is a weeday");
                case "Friday" -> System.out.println("It is a weeday");
                case "Sturday" -> System.out.println("It is the weekend");
                case "Sunday" -> System.out.println("It is the weekend");
                default -> System.out.println("Not a day!");
            }

            // reduced version
            switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thrsday", "Friday" ->
                System.out.println("It is a Weekday");

            case "Saturday", "Sunday" ->
                System.out.println("It is the weekend");

            default -> System.out.printf("%s is not a day\n", day);
        }
        }
    }
    ```
6. Built a simple calculator program.

### Day 4
1. Learnt about logical operators in Java
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // logical operators
            // && - logical AND
            // || - logical OR
            // ! - logical NOT

            double temp = 20;
            boolean isSunny = true;

            if (temp <= 30 && temp >= 0 && isSunny) {
                System.out.println("The weather is good!");
                System.out.println("It is sunney outside");
            } else if (temp <= 30 && temp >= 0 && !isSunny) {
                System.out.println("The weather is good!");
                System.out.println("It is cloudy outside");
            } else if (temp > 30 || temp < 0) {
                System.out.println("The weather is bad!");
            }
        }
    }
    ```

2. Learnt about Loops (while loop, do-while loop, for loop and nested loops) in Java.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // loops

            // while loop
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println("");

            // do-while loop
            i = 1;
            do {
                System.out.print(i + " ");
                i++;
            } while (i <= 10);

            System.out.println("");

            // for loop
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");

            // nested loops
            for (int k = 0; k < 5; k++) {
                for (int l = 0; l < 5; l++) {
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
    }
    ```

3. Learnt about the Methods (Functions) in Java.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            sayHello();
            sayHello();
            int res1 = getSum();
            int res2 = getSumWithArgs(9, 7);

            System.out.println(res1);
            System.out.println(res2);
        }

        static void sayHello() {
            System.out.println("Hello World!");
            System.out.println("I'm learning Java");
        }

        static int getSum() {
            return 5 + 6;
        }

        static int getSumWithArgs(int n1, int n2) {
            return n1 + n2;
        }
    }
    ```

4. Learnt about the method overloading in Java.
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // overloaded methods -> methods that shares the same name,
            // but different parameters
            // signature = name + parameters

            System.out.println(add(2, 3));
            System.out.println(add(2, 3, 6));
        }

        static double add(double n1, double n2) {
            return n1 + n2;
        }

        static double add(double n1, double n2, double n3) {
            return n1 + n2 + n3;
        }
    }
    ```

5. Built a simple banking program to understand methods, enhanced switch statement, loops, if statement

6. Built a simple dice roller program.

7. Learnt about the Arrays, methods with variable argument, 2D arrays in Java
    ```java 
    package com.example;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // arrays

            String[] names = { "David", "Steve", "Sarah", "John" };

            System.out.println(names[1]);

            names[1] = "Tony";

            System.out.println(names[1]);

            System.out.println("Array Length: " + names.length);

            // sorting an array
            Arrays.sort(names);

            // typical for loop
            for (int i = 0; i < names.length; i++) {
                System.out.println("Name: " + names[i]);
            }

            System.out.println("");

            // enhanced for loop (for each loop)
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // String[] foods = new String[5]; // another method to initialize an array

            // for (int i = 0; i < 5; i++) {
            // System.out.print("Enter Food: ");
            // foods[i] = scanner.nextLine();
            // }

            // for (String food : foods) {
            // System.out.println("Foods: " + food);
            // }

            scanner.close();

            /* Variable Arguments */
            int tot = sum(7, 8, 6, 4, 3, 4, 6);
            System.out.println(tot);

            /* 2D Arrays */
            String[][] groceries = {
                    { "apple", "orange", "banana" },
                    { "potato", "onion", "carrot" },
                    { "chicken", "pork", "beef", "fish" }
            };

            for (String[] foods : groceries) {
                for (String food : foods) {
                    System.out.print(food + " ");
                }
                System.out.println("");
            }
        }

        static int sum(int... numbers) {
            int total = 0;
            for (int number : numbers) {
                total += number;
            }
            return total;
        }
    }
    ```

8. Built a simple quiz game using Java.

### Day 5
1. Built a Simple Rock, Paper, Scissor Game.
2. Learnt about the basics of OOP (classes and objects)
    ```java
    // Car.java
    package com.example;

    public class Car {
        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        double price = 58000.99;
        boolean isRunning = false;

        void start() {
            isRunning = true;
            System.out.println("Starting the engine!");
        }

        void stop() {
            isRunning = false;
            System.out.println("Stopping the engine!");
        }

        void drive() {
            System.out.println("You are driving the " + model);
        }
    }
    ```

    ```java
    // Main.java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // lets begin OOP baby.....

            // Object = An entity that holds data (attributes)
            // and can perform actions (methods)
            // It is a reference data type

            // let's create a object in Car class
            Car car1 = new Car();
            Car car2 = new Car();

            System.out.println(car1.model + " " + car2.model);
        }
    }
    ```

3. Learnt about constructors in Java.
    ```java
    // Student.java
    package com.example;

    public class Student {
        String name;
        int age;
        double gpa;
        boolean isEnrolled;

        Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        void study() {
            System.out.println(this.name + " is studying!");
        }
    }
    ```
    ```java
    // Main.java
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
    ```

4. Learnt about the Array of Objects in Java.
    ```java
    // Car.java
    package com.example;

    public class Car {
        String model;
        String color;

        Car(String model, String color) {
            this.model = model;
            this.color = color;
        }

        void drive() {
            System.out.println("You are driving a " + this.color + " " + this.model);
        }
    }
    ```
    ```java
    // Main.java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // array of objects
            Car[] cars = {
                    new Car("Mustang", "Red"),
                    new Car("Corvette", "Blue"),
                    new Car("Charger", "Yellow")
            };
            for (Car car : cars) {
                car.drive();
            }

            System.out.println("");

            for (Car car : cars) {
                car.color = "black";
            }

            System.out.println("");
            
            for (Car car : cars) {
                car.drive();
            }
        }
    }
    ```

5. Learnt about `static` keywork in Java
    ```java
    // Product.java
    package com.example;

    public class Product {
        static int productCount;
        String productName;

        Product(String name) {
            this.productName = name;
            productCount++;
        }

        static void showProductCount() {
            System.out.println("Product Count: " + productCount);
        }
    }
    ```
    ```java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // static keyword

            Product p1 = new Product("iPhone 11");
            Product p2 = new Product("MacBook Pro");
            Product p3 = new Product("iPad");

            System.out.println("Products Count: " + Product.productCount);
            Product.showProductCount();
        }
    }
    ```

6. Learnt about inheritance and multi-level inheritance in Java
    ```java
    // Organism.java
    package com.example;

    public class Organism {
        boolean isAlive;

        Organism() {
            isAlive = true;
        }
    }
    ```
    ```java
    // Animal.java
    package com.example;

    public class Animal extends Organism {
        void eat() {
            System.out.println("Animal is eating!");
        }
    }
    ```
    ```java
    // Plant.java
    package com.example;

    public class Plant extends Organism {
        void photosynthesize() {
            System.out.println("Plant absorbs sunlight and CO2");
        }
    }

    ```
    ```java
    // Dog.java
    package com.example;

    public class Dog extends Animal {

        int lives = 1;

        void speak() {
            System.out.println("Woof Woof");
        }
    }
    ```
    ```java
    // Cat.java
    package com.example;

    public class Cat extends Animal {
        int lives = 9;

        void speak() {
            System.out.println("Meow...");
        }
    }
    ```
    ```java
    // Main.java
    package com.example;

    public class Main {
        public static void main(String[] args) {
            // inheritance
            Dog dog = new Dog();
            Cat cat = new Cat();

            dog.eat();
            cat.eat();

            System.out.println(dog.lives);
            System.out.println(cat.lives);

            dog.speak();
            cat.speak();

            Plant plant = new Plant();

            plant.photosynthesize();
        }
    }
    ```