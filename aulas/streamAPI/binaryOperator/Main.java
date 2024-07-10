package aulas.streamAPI.binaryOperator;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String args[]) {
        // operação que combina dois elementos do tipo T e retorna um valor do mesmo tipo
        BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;
        int resultado = somar.apply(2, 2);

        System.out.println("resultado: " + resultado);
    }
}