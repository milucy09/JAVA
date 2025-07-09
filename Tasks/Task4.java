package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.println("The input string is a Palindrome");
        } else {
            System.out.println("The input string is not a Palindrome");
        }

        s.close();
    }
    
}
