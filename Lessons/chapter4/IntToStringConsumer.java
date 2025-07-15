package Lessons.chapter4;

import java.util.function.Consumer;

public class IntToStringConsumer {
    public static void main(String[] args) {
        Consumer<Integer> printAsString = (num) -> {
            String str = String.valueOf(num);
            System.out.println("String from Consumer: " + str);
        };

        // Use it
        printAsString.accept(456);  // Output: "456"
    }
}
