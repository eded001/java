package aulas.collection.list.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> nomeList = new LinkedList<>();

        nomeList.add("edgar");
        nomeList.add("cecília");
        nomeList.add("bernardo");

        System.out.println(nomeList);

        nomeList.removeFirst();

        System.out.println(nomeList);
    }
}