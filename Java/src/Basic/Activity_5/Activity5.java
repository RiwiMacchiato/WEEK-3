package javaBasic.Activity_5;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity5 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("apple");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Palabras Repetidas:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " = " + wordCount.get(word));
        }
    }
}
