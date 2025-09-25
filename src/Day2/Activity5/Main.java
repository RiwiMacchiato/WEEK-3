package Day2.Activity5;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {


        ArrayList<Product> catalog = new ArrayList<>();

        catalog.add(new Product("01",2500, "laptop") );
        catalog.add(new Product("02", 3000, "arroz"));
        catalog.add(new Product("03", 3500, "panela"));
        catalog.add(new Product("04", 4000, "granola"));
        catalog.add(new Product("05", 2000, "plato"));

        catalog.remove(2);

        catalog.get(0).setName("salchicha");

        for (Product prod : catalog) {
            System.out.println(prod);
        }

    }
}
