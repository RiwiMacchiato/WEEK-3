import java.util.ArrayList;

import models.Circle;
import models.Shape;
import models.Square;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        Square square = new Square(4.0);
        Circle circle = new Circle(5.0);

        shapes.add(square);
        shapes.add(circle);
        
        for(Shape shape : shapes) {
            System.out.println(shape.findArea(5.0));
        }
    }
}
