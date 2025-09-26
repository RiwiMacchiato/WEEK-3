package Exercises.Activity_1;

import java.util.ArrayList;

public class Activity1 {

    static void main() {

        ArrayList<Operable> interfaces = new ArrayList<>();
        interfaces.add(new Fan());
        interfaces.add(new Engine());

        for (Operable ver : interfaces){
            ver.start();
            ver.stop();
        }
    }
}
