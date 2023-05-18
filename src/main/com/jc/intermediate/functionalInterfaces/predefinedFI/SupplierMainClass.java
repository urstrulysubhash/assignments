package main.com.jc.intermediate.functionalInterfaces.predefinedFI;

import java.util.function.Supplier;

public class SupplierMainClass {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Java";

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());

    }
}
