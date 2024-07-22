package aulas.collection.map.linkedHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> nomeIdade = new HashMap<>();

        nomeIdade.put("edgar", 19);
        nomeIdade.put("cecília", 11);
        nomeIdade.put("bernardo", 9);

        for(String key : nomeIdade.keySet()) {
            System.out.println("key: " + key + " | " + "value: " + nomeIdade.get(key));
        }
    }
}