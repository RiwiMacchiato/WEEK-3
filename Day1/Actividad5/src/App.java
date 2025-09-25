import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
