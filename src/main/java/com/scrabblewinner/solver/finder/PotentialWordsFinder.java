package com.scrabblewinner.solver.finder;

import java.util.ArrayList;

public class PotentialWordsFinder {
    public static ArrayList<String> getAll(char[] column, char[] holder) {


        return new ArrayList<>();
    }

    private static char[] getAllSortedLetters(char[] column, char[] holder) {
        return new char[0];
    }


    public static ArrayList<Character> getMissingLetters(char[] word, char[] letters) {
        int lettersPointer = 0;
        ArrayList<Character> missingLetters = new ArrayList<>();

        for (int wordPointer = 0; wordPointer < word.length; wordPointer++) {
            while (word[wordPointer] > letters[lettersPointer])
                lettersPointer++;
            if (word[wordPointer] == letters[lettersPointer]) {
                wordPointer++;
                lettersPointer++;
            } else {
                missingLetters.add(word[wordPointer]);
                wordPointer++;
            }
        }

        return missingLetters;
    }
}
