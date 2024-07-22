package aulas.collection.set.linkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> nomes = new LinkedHashSet<>();

        nomes.add("edgar");
        nomes.add("cecília");
        nomes.add("edgar");

        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}