package dia2.activity3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Square(3));
        shapes.add(new Circle(7));
        shapes.add(new Square(7));

        for(Shape shape : shapes){
            if(shape instanceof Circle){
                System.out.println("Area circulo: " + shape.area());
            } else {
                System.out.println("Area del cuadrado: " + shape.area());
            }
        }

    }
}
