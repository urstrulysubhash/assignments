package main.com.jc.intermediate.functionalInterfaces.predefinedFI;

import java.util.function.UnaryOperator;

public class UnaryOperatorMainClass {
    public static void main(String[] args) {

        UnaryOperator<String> uoperator = s -> s.toUpperCase();
        System.out.println(uoperator.apply("Java"));


    }
}
