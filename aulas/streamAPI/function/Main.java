package aulas.streamAPI.function;

import java.util.function.Function;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        // operação que aceita um argumento do tipo T e retorna um valor do tipo R
        Function<Integer, Integer> dobrar = n1 -> n1 * 2;
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());

        System.out.println("antes");
        numeros.forEach(System.out::println);

        System.out.println("");

        System.out.println("depois");
        numerosDobrados.forEach(System.out::println);
    }
}