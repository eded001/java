package aulas.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class VowelOrConsonant {
    private List<String> wordList;
    private List<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));

    public VowelOrConsonant() {
        this.wordList = new ArrayList<>();
    }

    private String[] spliter(String str) {
        return str.split("");
    }

    public boolean isVowel(char character) {
        return true;
    }

    public boolean isConsonant(char character) {
        return true;
    }

    public int getNumVowel(String str) {
        String[] stringSplited = this.spliter(str);
        int numVowel = 0;

        for(String letter : stringSplited) {
            if (vowels.contains(letter)) {
                numVowel++;
            }
        }

        return numVowel;
    }

    public int getNumConsonant(String str) {
        String[] stringSplited = this.spliter(str);
        int numConsonant = 0;

        for(String letter : stringSplited) {
            if (vowels.contains(letter)) {
                numConsonant++;
            }
        }

        return numConsonant;
    }

    public List<String> getVowels(String str) {
        String[] stringSplited = this.spliter(str);
        List<String> vowelList = new ArrayList<>();

        if(!stringSplited.equals(" ")) {
            for(String letter : stringSplited) {
                if(vowels.contains(letter)) {
                    vowelList.add(letter.toLowerCase());
                }
            }
        } else {
            throw new RuntimeException("A string passada está vazia2");
        }

        return vowelList;
    }

    public List<String> getConsonants(String str) {
        String[] stringSplited = this.spliter(str);
        List<String> consonantList = new ArrayList<>();

        if(!stringSplited.equals(" ")) {
            for(String letter : stringSplited) {
                if(!(vowels.contains(letter)) && !letter.equals(" ")) {
                    consonantList.add(letter.toLowerCase());
                }
            }
        } else {
            throw new RuntimeException("A string passada está vazia4");
        }

        return consonantList;
    }
}