# Task1
# Task2
# Task3
Class name Task3:
Change the variables in the first section, so that each if statement resolves as true.

    String a = new String("Wow");
    String b = "Wow";
    String c = a;
    String d = c;

    boolean bl = a == b;
    boolean b2 = d.equals(b + "!"); boolean b3 = !c.equals(a);
    if (bl && b2 && b3) {
        System.out.println("Success!");
    }

# Task4
# Task5

Task5.java
Check whose largest number in 3 inputs
Write a program that takes in three numbers from the user and outputs the largest number. if all numbers are equal it will print All numbers are equal
    
# Task10

Write the method printFullName of student which prints the full name of a student.

class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Your code goes here
}
public class Tasksheet122{
    public static void main(String[] args) { 
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"), 
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
    };
    
    for (Students: students) {
        s.printFullName();
        }
    }
}

# Task11

Taskll.java
Task: Create a Java class to represent a Book and implement a constructor to initialize its attributes. Instructions:
Create a new Java class called "Book" with the following attributes:
• String title
• String author 
• int yearPublished
• double price

Implement a constructor in the Book class that takes four parameters corresponding to the attributes and initializes them.Create a main method in a separate class to test the constructor: • Instantiate three Book objects with different values using the constructor.

• Print out the details of each book (title, author, yearPublished, and price) using toString();

Example Output:

Book 1:
Title: "Java Programming"
Author: "John Smith"
Year Published: 2021
Price: $39.99

Book 2:
Title: "Python Basics" Author: "Jane Doe"
Year Published: 2020
Price: $29.99

Book 3:
Title: "C++ Essentials"
Author: "Michael Johnson"
Year Published: 2019
Price: $49.99