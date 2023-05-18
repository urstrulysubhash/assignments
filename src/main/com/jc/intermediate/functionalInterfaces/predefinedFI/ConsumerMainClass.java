package main.com.jc.intermediate.functionalInterfaces.predefinedFI;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMainClass {
    public static void main(String[] args) {

        /*

          Write a consumer that prints whatever I give as input..
          Integer..
         */
        Consumer<Integer> consumer = e -> {
            System.out.println(e* 2);
        };

        consumer.accept(10);

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        print(numbers, consumer);

    }

    public static void print(List<Integer> list, Consumer<Integer> consumer) {
        for(Integer i: list) {
            consumer.accept(i);
        }
    }
}
