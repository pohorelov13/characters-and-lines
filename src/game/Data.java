package game;

import java.util.Random;
import java.util.Scanner;

public class Data {
    private String[] words;
    private char[] chars;
    private String hiddenWord;
    private String userWord;
    private Scanner sc = new Scanner(System.in);
    private Random random = new Random();

    void doGame() {
        words = new String[]{"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        chars = new char[]{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#',
                '#', '#', '#', '#', '#',};
        hiddenWord = words[random.nextInt(words.length)];

        handleData();
    }

    private void handleData() {
        do {
            System.out.println("Try to guess my word:");
            userWord = sc.nextLine();
            printInfo(userWord, initOutput());
        }
        while (!userWord.equals(hiddenWord));
    }

    private String initOutput() {
        for (int j = 0; j < Math.min(userWord.length(), hiddenWord.length()); j++) {
            if (hiddenWord.charAt(j) == userWord.toLowerCase().charAt(j)) {
                chars[j] = userWord.toLowerCase().charAt(j);
            } else chars[j] = '#';
        }
        return new String(chars);
    }

    private void printInfo(String userWord, String output) {
        if (userWord.equals(hiddenWord)) {
            System.out.println("Congratulation, " + userWord + " is correct answer");
            sc.close();
        } else System.out.println("Is that all you can do?\n" + output);
    }
}