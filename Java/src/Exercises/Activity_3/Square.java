package Exercises.Activity_3;

public class Square extends Shape{

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}
