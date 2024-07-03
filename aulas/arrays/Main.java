package aulas.arrays;

public class Main {
    public static void main(String args[]) {
        VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
        String str = "Cantando pro Santo";

        System.out.println("número de consoantes: " + vowelOrConsonant.getNumConsonant(str));
        System.out.println("número de vogais: " + vowelOrConsonant.getNumVowel(str));

        System.out.println("vogais: " + vowelOrConsonant.getVowels(str));
        System.out.println("consoantes: " + vowelOrConsonant.getConsonants(str));
    }
}