package Day2.Activity5;

public class Product {
    private String id;
    private String name;
    private double price;


    public Product(String id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
