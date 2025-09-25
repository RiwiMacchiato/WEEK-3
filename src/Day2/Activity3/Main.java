package Day2.Activity3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(4));
        shapes.add(new Square(3));
        shapes.add(new Circle(1.5));
        shapes.add(new Square(1.6));

        for (Shape shap : shapes) {
            System.out.println("Area " + shap.area());
        }
    }
}
