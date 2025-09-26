package Exercises.Activity_5;

import java.util.ArrayList;

public class Activity5 {

    static void main() {

        ArrayList<Product> products = new ArrayList<>();

        //Agregar productos a la lista products
        products.add(new Product("039b","Colores Norma",13000));
        products.add(new Product("021p","Cartulina",23333));
        products.add(new Product("022p","Block Iris",23456));
        products.add(new Product("040b","Boligrafo",43555));
        products.add(new Product("019M","Morral",60000));

        //Eliminar un item de la lista por index
        products.remove(2);

        //Actualizar nombre de un producto
        products.get(0).setName("Colores Prismacolor");

        for (Product p:products){
            System.out.println(p.getId() +" "+ p.getName() + " " + p.getPrice());
        }


    }
}
