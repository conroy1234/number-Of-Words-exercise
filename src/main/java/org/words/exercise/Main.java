package org.words.exercise;

public class Main {
    private static final String WORDS = "Fish DOG banana fish cat a pineapple carrot dog";

    public static void main(String args[]) {
        NumberOfWords numberOfWords = new NumberOfWords();
        String originalWords = numberOfWords.originalWords(WORDS);
        String finalWords = numberOfWords.finalWords(WORDS);
        System.out.println(originalWords);
        System.out.println(finalWords);

    }

}