import java.util.ArrayList;
import models.Formatter;
import models.UpperCase;
import models.LowerCase;
import models.TitleCase;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Formatter> formatters = new ArrayList<>();

        // Add different formatting strategies
        formatters.add(new UpperCase());
        formatters.add(new LowerCase());
        formatters.add(new TitleCase());

        String testString = "hello world from java programming";

        System.out.println("Original string: " + testString);
        System.out.println();

        for (Formatter formatter : formatters) {
            System.out.println(formatter.getClass().getSimpleName() + ": " + formatter.format(testString));
        }
    }
}
