package dia2.activity3;

public class Square extends Shape{
    private double side;

    @Override
    double area() {
        return side*side;
    }

    Square(double side){
        this.side = side;
    }
    
}
