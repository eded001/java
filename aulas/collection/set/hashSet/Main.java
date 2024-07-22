package aulas.collection.set.hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String args[]) {
        HashSet<String> nomes = new HashSet<>();

        nomes.add("edgar");
        nomes.add("cecília");
        nomes.add("bernardo");
        nomes.add("edgar"); // não vai ser adicionado

        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        nomes.remove("bernardo");

        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}