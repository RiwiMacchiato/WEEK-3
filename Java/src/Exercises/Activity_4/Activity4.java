package Exercises.Activity_4;

import java.util.ArrayList;

public class Activity4 {

    static void main() {

        ArrayList<Process> process = new ArrayList<>();

        process.add(new CsvProcess());
        process.add(new JsonProcess());


        for(Process p: process){
            p.execute();

        }


    }
}
