package models;

public class Square extends Shape{
    private double side;


    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea(double side) {
        double area = side * side;
    return area;
    }
}

