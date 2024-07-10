package aulas.streamAPI.predicate;

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);

        // operação que aceita um valor do tipo T e retorna um valor booleano
        Predicate<Integer> numeroPar = numero -> numero % 2 == 0;
        Predicate<Integer> numeroImpar = numero -> numero % 2 != 0;

        List<Integer> numerosPares = numeros.stream().filter(numeroPar).collect(Collectors.toList());
        List<Integer> numerosImpares = numeros.stream().filter(numeroImpar).collect(Collectors.toList());

        System.out.println("lista:");
        numeros.forEach(System.out::println);

        System.out.println("");

        System.out.println("números pares:");
        numerosPares.forEach(System.out::println);

        System.out.println("");

        System.out.println("números ímpares:");
        numerosImpares.forEach(System.out::println);
    }
}