package Day2.Activity8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Document> docs= new ArrayList<>();

        docs.add(new Book("Cuentos largos", 160));
        docs.add(new Magazine("Brothers together", 250));
        docs.add(new Book("The lion king", 99));
        docs.add(new Magazine("The three pigs", 250));

        System.out.println("Mayores a 100 paginas");

        for (Document doc : docs) {
            if (doc.pages() >= 100) {
                System.out.println(doc);
            }
        }
    }
}
