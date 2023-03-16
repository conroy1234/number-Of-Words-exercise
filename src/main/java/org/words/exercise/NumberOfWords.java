package org.words.exercise;

import org.words.sorter.SortByLentComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfWords {

    public String finalWords(String word) {
        String numbers[] = words(word);
        List<String> numberList = Arrays.asList(numbers);
        List<String> result = numberList.stream().distinct().collect(Collectors.toList());
        String finalWord = result.stream().collect(Collectors.joining(", "));
        return finalWord;

    }

    public String originalWords(String word) {
        return word;
    }

    private String[] words(String word) {
        String originalWord = originalWords(word);
        String wordIgnoreCase = originalWord.toLowerCase();
        String words[] = wordIgnoreCase.split(" ");
        int size = words.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        sortByLength(words);
        return words;
    }

    private List<String> sortByLength(String[] words) {
        List<String> list = Arrays.asList(words);
        Collections.sort(list, new SortByLentComparator());
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        return list;
    }

}