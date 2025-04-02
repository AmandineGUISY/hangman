package org.example;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/words.txt";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String found = "";
        int level = 1;

        Scanner scanner = new Scanner(System.in);
        List<String> words = getWords.words(path);
        Hangman hangman = new Hangman();
        hangman.hangman(0);
        hangman.hangman(1);
        hangman.hangman(2);
        hangman.hangman(3);
        hangman.hangman(4);
        hangman.hangman(5);
        hangman.hangman(6);

        while(level < words.size() + 1) {
            level++;
        }

        System.out.println("Nombre de mots chargés: " + words.get(1));
        System.out.println("Liste des mots:" + words);
    }
}