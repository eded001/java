package aulas.streamAPI.methodReference;

import java.util.function.Supplier;

public class Main {
    public static void main(String args[]) {
        Pessoa edgar = new Pessoa();
        edgar.setName("Edgar");

        Supplier<String> nameSupplier = edgar::getName;

        System.out.println(nameSupplier.get());
    }
}