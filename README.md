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

# Task6

Task6.java
Loop through and print out all even numbers, each in a separate line, from the numbers list in the same order they are received. Don't print any numbers that come after 237 in the sequence. 

public static void main(String[] args) {
    int[] numbers = {
        951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544, 615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941, 386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
        815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
        958, 609,842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 743, 527};
    Your code goes here
    }

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

# Task12

Task12.java
Write a new method in Point called scale, that will make the point closer by half to (0,0). So for example, point (8, 4) after scale will be (4,2).

class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Your code goes here
}

public class Tasksheet124 {
    public static void main(String[] args) {
        Point p = new Point (32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}