package aulas.streamAPI.lambdaFunctions;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Edgar");
        nomes.add("Cecília");
        nomes.add("Bernardo");

        nomes.forEach(nome -> System.out.println(nome));
    }
}