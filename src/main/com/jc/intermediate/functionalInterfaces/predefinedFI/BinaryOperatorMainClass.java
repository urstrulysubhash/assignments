package main.com.jc.intermediate.functionalInterfaces.predefinedFI;

import java.util.function.BinaryOperator;

public class BinaryOperatorMainClass {
    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (a, b) -> a + " "+ b;
        System.out.println(binaryOperator.apply("Java", "Course"));
    }
}
