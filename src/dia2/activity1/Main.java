package dia2.activity1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Operable> operables = new ArrayList<>();

        operables.add(new Engine());
        operables.add(new Fan());

        for(Operable operable: operables){

            operable.start();
            operable.stop();

        }

    }
    
}
