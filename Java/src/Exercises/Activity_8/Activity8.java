package Exercises.Activity_8;

import java.util.ArrayList;

public class Activity8 {

    static void main() {

        ArrayList<Documents> document = new ArrayList<>();
        document.add(new Book("caballo de troya",389));
        document.add(new Book("caballo de esparta",735));
        document.add(new Book("Caballo solo",80));
        document.add(new Book("ultime",100));

        System.out.println("Libros con menos menos de 100 pag:");
        for (Documents d: document){
            if(d.pages() >= 100){
                System.out.println(d.title + "# de paginas" +d.pages());
            }
        }
    }
}
