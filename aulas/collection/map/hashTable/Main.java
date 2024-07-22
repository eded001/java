package aulas.collection.map.hashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> numeros = new Hashtable<>();

        numeros.put("um", 1);
        numeros.put("dois", 2);
        numeros.put("três", 3);

        System.out.println(numeros);

        System.out.println();

        numeros.remove("três");

        System.out.println(numeros);
    }
}