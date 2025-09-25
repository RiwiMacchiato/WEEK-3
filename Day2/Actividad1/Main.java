import java.util.ArrayList;
import models.Engine;
import models.Operable;

public class Main {

    public static void main(String[] args) throws Exception {
        Engine engine = new Engine(1, "V6", "Diesel");

        ArrayList<Operable> operables = new ArrayList<>();
        operables.add(engine);
        for (Operable operable : operables) {
            operable.start();
            operable.turnOff();
        }
    }
}
