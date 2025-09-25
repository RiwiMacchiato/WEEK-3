package models;

public class Addition implements Calculable {

    @Override
    public double calculate(double... numbers) {
        double sum = 0.0;
        for (double number: numbers) {
            sum += number;
        }
        return sum;
    }

    public Integer calculate(Integer... numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
