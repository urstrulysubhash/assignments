package main.com.jc.intermediate.functionalInterfaces.examples;

public class MainClass {
    public static void main(String[] args) {

        MyFirstFI myFirstFI = () -> System.out.println("This is my First Lambda Expression");
        myFirstFI.print();


        MySecondFI mySecondFI_add = (a, b) -> System.out.println(a+b);
        mySecondFI_add.method(10, 20);


        MySecondFI mySecondFI_subtraction = (a, b) -> System.out.println(a-b);
        mySecondFI_subtraction.method(300, 50);

        MySecondFI mySecondFI_multiply = (a, b) -> System.out.println(a*b);
        mySecondFI_multiply.method(30, 50);

        MyThirdFI myThirdFI_length = (a) -> a.length();
        System.out.println( myThirdFI_length.method("Java"));


        MyThirdFI myThirdFI_index = (a)-> a.indexOf('a');
        System.out.println(myThirdFI_index.method("Java"));

        MyThirdFI myThirdFI_test = (a) -> a.hashCode();
        System.out.println(myThirdFI_test.method("Java"));


        MyThirdFI myThirdFI_multi_lines = (a) -> {
            System.out.println("Given String is " + a);
            System.out.println("Length of the string is "+ a.length());
            return a.length()* 2;
        };

        System.out.println(myThirdFI_multi_lines.method("Java"));







    }
}
