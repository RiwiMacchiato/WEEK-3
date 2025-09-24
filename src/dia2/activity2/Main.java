package dia2.activity2;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Calculable> calculables = new ArrayList<>();

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();

        calculables.add(addition);
        calculables.add(multiplication);

        for(Calculable calculable : calculables){
            System.out.println(calculable.calculate(5, 5));
        }


    }

}
