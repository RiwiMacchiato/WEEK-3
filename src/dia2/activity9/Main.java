package dia2.activity9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Formatter> formatters = new ArrayList<>();

        formatters.add(new LowerCase());
        formatters.add(new UpperCase());
        formatters.add(new TitleCase());

        String message = "hola muy buenas tardes";

        for(Formatter formatter : formatters){
            System.out.println(formatter.format(message));
        }

    }
}
