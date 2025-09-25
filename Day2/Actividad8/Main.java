import java.util.ArrayList;
import models.Document;
import models.Book;
import models.Magazine;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Document> documents = new ArrayList<>();

        // Add different documents
        documents.add(new Book("The Great Gatsby", 180));
        documents.add(new Book("Short Stories", 50));
        documents.add(new Magazine("Tech Weekly", 120));
        documents.add(new Magazine("Quick News", 30));
        documents.add(new Book("Programming Fundamentals", 450));

        System.out.println("Documents with 100 or more pages:");
        for (Document doc : documents) {
            if (doc.pages() >= 100) {
                System.out.println(doc.getTitle() + " - " + doc.pages() + " pages");
            }
        }
    }
}
