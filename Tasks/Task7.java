package Tasks;

import java.util.Scanner;

public class Task7 {
    public static int add(int a, int b){
        return a + b;
    }  
    
    public static int subtract(int a, int b){
        return a - b;
    } 

    public static int multiplication(int a, int b){
        return a * b;
    } 

    public static double devide(int a, int b){
        if (b == 0){
            System.out.println("Cannot devide by zero!");
            return 0;
        }
        return (double) a / b;
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Division: " + devide(num1, num2));

        scanner.close();
    }
}
