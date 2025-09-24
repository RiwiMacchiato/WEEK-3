package dia2.activity5;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("1", "Jabon", 2000));
        products.add(new Product("2", "Limon", 500));
        products.add(new Product("3", "Cereal", 5000));
        products.add(new Product("4", "Escoba", 2500));
        products.add(new Product("5", "Harina", 4000));

        System.out.println("Lista original: ");
        iterate(products);

        products.remove(1);

        System.out.println("Se elimino el segundo: ");
        iterate(products);


        products.get(0).setName("Jabon Mejorado");
        System.out.println("Se le cambio el nombre al primer producto:");
        iterate(products);


    }

    public static void iterate(ArrayList<Product> products){
        for(Product product : products){
            System.out.println(product);
        }
    }

}
