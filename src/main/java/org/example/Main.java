package org.example;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/words.txt";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String tried;
        String letter;
        int level = 0;
        int error = 0;

        Scanner scanner = new Scanner(System.in);
        List<String> words = getWords.words(path);
        Hangman hangman = new Hangman();

        while(level < words.size() && error < 6) {
            error = 0;
            tried = "";

            while(error < 6 && !Verify.isWin(words.get(level), tried)) {

                hangman.hangman(error);
                hangman.hangmanWord(words.get(level), tried);
                hangman.availableLetters(tried, alphabet);

                System.out.print("Choisi une lettre : ");
                letter = scanner.nextLine().trim().toUpperCase();

                while (Verify.verify(letter, tried, alphabet) == 1) {
                    System.out.print("Lettre invalide. Réessaie : ");
                    letter = scanner.nextLine().trim().toUpperCase();
                }

                error = Verify.errors(letter, words.get(level), error);
                tried = tried + letter;
                System.out.println(words.get(level));

            }
            hangman.hangman(error);

            if (Verify.isWin(words.get(level), tried)) {
                hangman.hangmanWord(words.get(level), tried);
                System.out.println("Bien joué! Tu as réussi le niveau "+ (level + 1) + "!");
            }
            level++;
        }
        System.out.println("Bravo à toi, tu as réussi tous les niveaux !");
    }
}