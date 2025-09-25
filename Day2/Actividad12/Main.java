import java.util.HashMap;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

        // Add words with their translations
        ArrayList<String> houseTranslations = new ArrayList<>();
        houseTranslations.add("house");
        houseTranslations.add("home");
        houseTranslations.add("residence");
        dictionary.put("casa", houseTranslations);

        ArrayList<String> carTranslations = new ArrayList<>();
        carTranslations.add("car");
        carTranslations.add("automobile");
        carTranslations.add("vehicle");
        dictionary.put("carro", carTranslations);

        ArrayList<String> bookTranslations = new ArrayList<>();
        bookTranslations.add("book");
        bookTranslations.add("tome");
        dictionary.put("libro", bookTranslations);

        // Add a new translation to an existing word
        dictionary.get("casa").add("dwelling");

        // Print all words and their translations
        System.out.println("Spanish-English Dictionary:");
        System.out.println("============================");

        for (String spanishWord : dictionary.keySet()) {
            System.out.print(spanishWord + ": ");
            ArrayList<String> translations = dictionary.get(spanishWord);
            for (int i = 0; i < translations.size(); i++) {
                System.out.print(translations.get(i));
                if (i < translations.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
