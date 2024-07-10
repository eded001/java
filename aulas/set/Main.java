package aulas.set;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) {
        Set<String> nomes = new HashSet<>();
        nomes.add("edgar");
        nomes.add("natacha");
        nomes.add("edgar"); // não vai ser adicionado

        for(String str : nomes) {
            System.out.println(str);
        }
    }
}