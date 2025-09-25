package models;

public class Multiplication implements Calculable {

    @Override
    public double calculate(double... numbers) {
        double product = 1;
        for (double number: numbers) {
            product *= number;
        }
        return product;
    }

    public Integer calculate(Integer... numbers) {
        Integer product = 1;
        for (Integer number : numbers) {
            product *= number; 
        }
        return product;
    }
}
