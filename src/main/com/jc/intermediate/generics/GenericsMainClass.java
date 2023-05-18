package main.com.jc.intermediate.generics;

public class GenericsMainClass {

    public static void main(String[] args) {

        SimpleGenericPOJO<String> sgp_string = new SimpleGenericPOJO<>("Java");
        System.out.println(sgp_string.getData());

        SimpleGenericPOJO<Integer> sgp_integer = new SimpleGenericPOJO<>(123);
        System.out.println(sgp_integer.getData());






    }
}
