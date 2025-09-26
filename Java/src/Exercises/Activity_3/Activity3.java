package Exercises.Activity_3;

import java.util.ArrayList;

class Activity3 {

    static void main(String [] args){
        ArrayList<Shape> shape = new ArrayList<>();
        shape.add(new Circle(3));
        shape.add(new Square(4));
        shape.add(new Circle(4));
        shape.add(new Square(3));

        for(Shape s: shape){
            System.out.println("Area: " + s.area());
        }


    }


}
