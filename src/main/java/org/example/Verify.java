package org.example;

public class Verify {
    public static int verify(String letter, String tried, String alphabet) {
        if(letter.length() != 1) {
            System.out.println("Invalid letter");
            return 1;
        }
        if(!alphabet.contains(letter)) {
            System.out.println("Your letter is not in the alphabet");
            return 1;
        }
        if(tried.contains(letter)) {
            System.out.println("You already tried this letter");
            return 1;
        }
        return 0;
    }

    public static int errors(String letter, String word, int errors) {
        if(word.toUpperCase().contains(letter)) {
            return errors;
        }
        return errors + 1;
    }
}
