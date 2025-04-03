package org.example;

// word : is the word we are trying to guess
// letter : is the letter he didn't find or tried yet
// guess : is the letter he is trying to guess

public class Hangman {
    public void hangman (int error) {
        switch (error) {
            case 0:
                System.out.println(
                        "\n\n\n\n\n" +
                        "=========\n");
                break;
            case 1:
                System.out.println(
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n");
                break;
            case 2:
                System.out.println(
                        "  +---+\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n");
                break;
            case 3:
                System.out.println(
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n");
                break;
            case 4:
                System.out.println(
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n");
                break;
            case 5:
                System.out.println(
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\ |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n");
                break;
            case 6:
                System.out.println(
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "=========\n" +
                        "Perdu ! Le pendu est complet...");
                break;
            default:
                System.out.println("Error");
        }
    }

    public void availableLetters (String tried, String alphabet) {
        for(int i = 0; i < alphabet.length(); i++) {
            if(tried.indexOf(alphabet.charAt(i)) >= 0) {
                System.out.print(" ");
            }
            else {
                System.out.print(alphabet.charAt(i) + " ");
            }

            if (i == 8 || i == 17 || i == 25) {System.out.println();}
        }

        if (!tried.isEmpty()) {
            System.out.println("\nLettres essayées: " + tried);
        }
        System.out.println();
    }

    public void hangmanWord (String word, String tried) {
        word = word.toUpperCase();

        for(int i = 0; i < word.length(); i++) {
            if(tried.indexOf(word.charAt(i)) == -1) {
                System.out.print("_ ");
            }
            else {
                System.out.print(word.charAt(i) + " ");
            }
        }
        System.out.println("\n");
    }
}
