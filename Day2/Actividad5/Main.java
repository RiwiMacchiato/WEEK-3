import java.util.ArrayList;
import models.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Product("1", "Bread", 20.0);
        Product p2 = new Product("2", "Milk", 15.0);
        Product p3 = new Product("3", "Eggs", 30.0);
        Product p4 = new Product("4", "Cheese", 50.0);
        Product p5 = new Product("5", "Butter", 45.0);
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        products.remove(1);
        p1.setName("Buñuelos");

        for(Product product : products){
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("\n");
        }
    }
}
