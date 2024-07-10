package aulas.streamAPI.consumer;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String args[]) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // operação que aceita um argumento do tipo T e não retorna nenhum resultado
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        };

        System.out.println("primeiro jeito: ");
        numeros.stream().forEach(imprimirNumeroPar);

        System.out.println();

        System.out.println("segundo jeito (mais elegante): ");
        numeros.stream().filter(numero -> numero % 2 == 0).forEach(System.out::print);
    }
}