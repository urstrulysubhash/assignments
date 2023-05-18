package main.com.jc.intermediate.functionalInterfaces.predefinedFI;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMainClass {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(21);
        numbers.add(30);
        numbers.add(41);
        numbers.add(50);
        numbers.add(61);


        //even


        /**
         *
         *  Requirement:
         *
         *  Write a predicate that accepts String as input and checks if it starts with "A"
         *
         * .startsWith
         *
         */


        Predicate<String> p = s -> s.startsWith("A");
        System.out.println(p.test("Amazon")); //true
        System.out.println(p.test("Google")); //false

        Predicate<Integer> even = e -> e % 2 == 0;
        System.out.println(even.test(21)); //false;

        System.out.println(even.test(20)); //true
        System.out.println(applyPredicate(numbers, even));

        Predicate<Integer> odd = e -> e % 2 != 0;
        System.out.println(applyPredicate(numbers, odd));

        //Given a list of Strings, filter the Strings that starts with char "A"
        List<String> names = Arrays.asList("Apple", "Amazon", "Microsoft", "Google");

        Predicate<String> prefix = e -> e.startsWith("A");
        System.out.println(applyPredicate_String(names, prefix));

        //print company names that have length > 5
        Predicate<String> length_5 = s -> s.length()>5;
        System.out.println(applyPredicate_String(names,length_5));

        //print all companies that contains o
        Predicate<String> contains_o = s -> s.contains("o");
        System.out.println(applyPredicate_String(names, contains_o));
    }


    public static ArrayList<Integer> applyPredicate(ArrayList<Integer> list, Predicate<Integer> predicate) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer i : list) {
            if(predicate.test(i)) {
                arrayList.add(i);
            }
        }

       return arrayList;
    }

    public static ArrayList<String> applyPredicate_String(List<String> list, Predicate<String> predicate) {

        ArrayList<String> arrayList = new ArrayList<>();
        for(String i : list) {
            if(predicate.test(i)) {
                arrayList.add(i);
            }
        }

        return arrayList;
    }
}
