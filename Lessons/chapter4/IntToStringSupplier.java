package Lessons.chapter4;

import java.util.function.Supplier;

public class IntToStringSupplier {
    public static void main(String[] args) {
        int number = 123;

        Supplier<String> intToString = () -> String.valueOf(number);

        // Use it
        String result = intToString.get();
        System.out.println("String from Supplier: " + result);  // Output: "123"
    }
}

