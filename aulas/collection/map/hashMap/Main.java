package aulas.collection.map.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> nomeIdade = new HashMap<>();

        nomeIdade.put("edgar", 19);
        nomeIdade.put("cecília", 11);
        nomeIdade.put("bernardo", 9);

        System.out.println(nomeIdade);

        System.out.println();

        System.out.println(nomeIdade.get("edgar"));

        System.out.println();

        for(String key : nomeIdade.keySet()) {
            System.out.println("key: " + key + " | value: " + nomeIdade.get(key));
        }

        nomeIdade.remove("edgar");

        System.out.println();

        System.out.println(nomeIdade);
    }
}