package main.com.jc.intermediate.functionalInterfaces.predefinedFI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionMainClass {
    public static void main(String[] args) {

        //String as input and give me length as output..
        Function<String, Integer> fun = s -> s.length();
        System.out.println(fun.apply("Java"));

        List<String> names = Arrays.asList("Amazon", "Google", "Microsoft", "Facebook");
        for(String s: names) {
            System.out.println(fun.apply(s));
        }


        BiFunction<String, String, Integer> biFunction = (a, b) ->  (a+b).length();
        System.out.println(biFunction.apply("Java", "Course"));







    }
}
