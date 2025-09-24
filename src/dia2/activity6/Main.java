package dia2.activity6;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();
        words.add("Johan");
        words.add("Ramirez");
        words.add("Johan");
        words.add("Johan");
        words.add("Java");
        words.add("Johan");
        words.add("Java");

        HashMap<String,Integer> quantityWords = new HashMap<>();

        for(String word:words){
            if(quantityWords.containsKey(word)){
                quantityWords.put(word,quantityWords.get(word)+1);
            } else {
                quantityWords.put(word,1);
            }
        }

        for(var wordAppereances:quantityWords.entrySet()){
            if(wordAppereances.getValue()>2){
                System.out.println("*");
                continue;
            }
            System.out.println("Palabra: " + wordAppereances.getKey() + " ,cantidad: " + wordAppereances.getValue());
        }

    }

}
