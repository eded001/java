package aulas.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"edgar", "cecília", "bernardo"};
        String[] outrosNomes = {"edgar", "cecília", "bernardo"};

        Arrays.fill(nomes, 1, 2, "test");

        System.out.println(Arrays.compare(nomes, outrosNomes)); // output: 0 se os arrays comparados forem iguais
        System.out.println();

        // for each
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}