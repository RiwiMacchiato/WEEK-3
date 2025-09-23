package Activity5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class main {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("andres");
        words.add("sofia");
        words.add("pedro");
        words.add("andres");
        words.add("sofia");
        words.add("andres");


        HashMap<String, Integer> quantity = new HashMap<>();

        for (String word : words) {
            if (quantity.containsKey(word)) {
                quantity.put(word, quantity.get(word) + 1);
            } else {
                quantity.put(word, 1);
            }
        }
        for (var wordApper : quantity.entrySet()) {
            System.out.println("Palabra: " + wordApper.getKey() + " ,cantidad: " + wordApper.getValue());
        }

    }
}