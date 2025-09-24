package dia2.activity8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Document> documents = new ArrayList<>();

        documents.add(new Magazine("Hola", 5));
        documents.add(new Magazine("Hola1", 140));
        documents.add(new Magazine("Hola2", 125));
        documents.add(new Book("Hola3", 94));
        documents.add(new Book("Hola4", 103));
        documents.add(new Book("Hola5", 95));

        for(Document document : documents){
            if(document.pages()>=100){
                System.out.println(document);
            }
        }

    }
}
