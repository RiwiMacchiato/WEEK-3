package Day2.Activity9;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        String input = "hello woRLD, hoW ARE you?";

        ArrayList<Formatter> strategies = new ArrayList<>();
        strategies.add(new LowerCase());
        strategies.add(new UpperCase());
        strategies.add(new TitleCase());

        for (Formatter f : strategies) {
            System.out.println(f.format(input));
        }
    }
}
