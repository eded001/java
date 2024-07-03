package aulas.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        List<Integer> arrayInt = new ArrayList<>();
        Random random = new Random();

        for(int c = 0; c < 10; c++) {
            int numRandom = random.nextInt(101);

            arrayInt.add(numRandom);
        }

        System.out.println("list (antes): " + arrayInt);

        for(int c = arrayInt.size() - 1; c >= 0; c--) {
            int numValueIndex = arrayInt.get(c);

            if(numValueIndex % 2 != 0) {
                arrayInt.remove(c);
            }
        }

        System.out.println("list (depois): " + arrayInt);
    }
}