package Lessons.chapter4;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerExample {
    public static void main(String[] args) {
        Supplier<Integer> intSupplier = () -> 789;
        Consumer<String> stringConsumer = (s) -> System.out.println("Consumed: " + s);

        // Convert int to String and pass to consumer
        String result = String.valueOf(intSupplier.get());
        stringConsumer.accept(result);  // Output: "Consumed: 789"
    }
}
