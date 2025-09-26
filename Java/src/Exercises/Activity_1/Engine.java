package Exercises.Activity_1;

import java.sql.SQLOutput;

public class Engine implements Operable {


    @Override
    public void start() {
        System.out.println("Engine On");
    }

    @Override
    public void stop() {
        System.out.println("Engine Off");
    }
}
