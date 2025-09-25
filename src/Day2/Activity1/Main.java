package Day2.Activity1;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        Engine e =new Engine();
        Fan f = new Fan();

        ArrayList<Operable> opers = new ArrayList<>();

        opers.add(e);
        opers.add(f);

        for (Operable oper : opers) {

            oper.start();
            oper.stop();
        }
    }
}
