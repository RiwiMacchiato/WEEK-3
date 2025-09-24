package dia2.activity3;

public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }


}
