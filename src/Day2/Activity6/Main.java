package Day2.Activity6;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("menu");
        words.add("cafe");
        words.add("sopa");
        words.add("menu");
        words.add("pan");
        words.add("aseo");
        words.add("sopa");
        words.add("sopa");

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word: words) {
           // si existe sumamos 1
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (String key : freq.keySet()) {
            int count = freq.get(key);

            if (count > 2 ){
                System.out.println(key + " -> " + count + " *");
            } else {
                System.out.println(key + " -> " + count);
            }
            }

        }

    }

