package org.example;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/words.txt";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String tried = "A";
        String letter = "";
        int level = 1;
        int error = 0;

        Scanner scanner = new Scanner(System.in);
        List<String> words = getWords.words(path);
        Hangman hangman = new Hangman();

        while(error < 6) {

            hangman.hangman(error);
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

    }
}