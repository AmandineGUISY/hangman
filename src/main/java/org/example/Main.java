package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/words.txt";

        List<String> words = getWords.words();

        System.out.println("Nombre de mots chargés: " + words.size());
        System.out.println("Liste des mots:" + words);
    }
}