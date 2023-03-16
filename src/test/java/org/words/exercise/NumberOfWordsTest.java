package org.words.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfWordsTest {
    private static final String WORDS = "Fish DOG banana fish cat a pineapple carrot dog";
    NumberOfWords numberOfWords;

    @BeforeEach
    void setUp() {
        numberOfWords = new NumberOfWords();
    }

    @Test
    void finalWordsTest() {
        String expected = "a, cat, dog, fish, banana, carrot, pineapple";
        String actual = numberOfWords.finalWords(WORDS);
        assertEquals(expected, actual);
    }

    @Test
    void originalWords() {
        String expected = "Fish DOG banana fish cat a pineapple carrot dog";
        String actual = numberOfWords.originalWords(WORDS);
        assertEquals(expected, actual);
    }
}