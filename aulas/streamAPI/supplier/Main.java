package aulas.streamAPI.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        // operação que não aceita nenhum argumento e retorna um resultado do tipo T
        Supplier<String> helloWorld = () -> "hello world";

        List<String> printMsg = Stream.generate(helloWorld).limit(5).collect(Collectors.toList());

        printMsg.forEach(System.out::println);
    }
}