package Day2.Activity12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> diccionary= new HashMap<>();

        ArrayList<String> casaTranslations= new ArrayList<>();

        casaTranslations.add("house");
        casaTranslations.add("home");
        diccionary.put("casa", casaTranslations);

        ArrayList<String> perroTranslations= new ArrayList<>();
        perroTranslations.add("dog");
        perroTranslations.add("hound");
        diccionary.put("perro", perroTranslations);

        diccionary.get("perro").add("pooch");

        for (Map.Entry<String, ArrayList<String>> entry : diccionary.entrySet()) {
            String spanisWord= entry.getKey();
            ArrayList<String> translations = entry.getValue();
            System.out.println(spanisWord + ": " + String.join(", ", translations ));
        }
    }
}