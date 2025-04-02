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
}
