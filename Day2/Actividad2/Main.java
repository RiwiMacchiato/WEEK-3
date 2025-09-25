import java.util.ArrayList;
import models.Addition;
import models.Calculable;
import models.Multiplication;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Calculable> Calculables = new ArrayList<>();

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();

        Calculables.add(addition);
        Calculables.add(multiplication);

        for(Calculable calculable : Calculables) {
            System.out.println(calculable.calculate(1,2,3,4,5));
        }
    }
}
