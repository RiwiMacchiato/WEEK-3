package Day2.Activity2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Calculable> calculate= new ArrayList<>();

        calculate.add(new Addition());
        calculate.add(new Multiplication());

        for (Calculable cal : calculate) {
            double result = cal.calcular(3, 4);
            System.out.println("result: "+ result);

        }
    }
}
