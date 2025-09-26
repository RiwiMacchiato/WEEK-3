package Exercises.Activity_2;

import java.util.ArrayList;

public class Activity2 {

    static void main() {
        ArrayList<Calculable> operacion = new ArrayList<>();
        operacion.add(new Multiplication());
        operacion.add(new Addition());

        for (Calculable op : operacion) {
            double res = op.calculate(3, 4);
            System.out.println(res);
        }
    }
}
