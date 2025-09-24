package dia2.activity12;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> dictionary = new HashMap<>();

        //adding words and their meanings
        ArrayList<String> meanings1 = new ArrayList<>();
        meanings1.add("See");
        meanings1.add("Look");
        dictionary.put("Ver", meanings1);

        ArrayList<String> meanings2 = new ArrayList<>();
        meanings2.add("Throw");
        meanings2.add("Hurl");
        meanings2.add("Launch");
        dictionary.put("Lanzar", meanings2);

        ArrayList<String> meanings3 = new ArrayList<>();
        meanings3.add("Think");
        meanings3.add("Ponder");
        dictionary.put("Reflexionar", meanings3);

        //printing the dictionary
        for (String word : dictionary.keySet()) {
            System.out.print(word + ": ");
            ArrayList<String> translations = dictionary.get(word);
            System.out.println(String.join(", ", translations));
        }


        //adding a new translation to an existing word
        dictionary.get("Ver").add("Watch");

        
        System.out.println("\nDespués de agregar una nueva traducción a 'Ver':\n ");
        for (String word : dictionary.keySet()) {
            System.out.print(word + ": ");
            ArrayList<String> translations = dictionary.get(word);
            System.out.println(String.join(", ", translations));
        }

    }
}
