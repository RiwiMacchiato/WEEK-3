
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<>();
        HashMap<String,Integer> frequencies = new HashMap<>();

        for(String word:words){
            if(frequencies.containsKey(word)){
                frequencies.put(word,frequencies.get(word)+1);
            } else {
                frequencies.put(word,1);
            }
        }

        for(var wordCount:frequencies.entrySet()){
            if(wordCount.getValue() >= 2){
                System.out.println("*");
            } else {
                continue;
            }
            System.out.println("Word: " + wordCount);
        }
    }
}
