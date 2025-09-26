package Exercises.Activity_9;

import java.util.ArrayList;

public class Activity9 {
    static void main() {

        ArrayList<Formatter> startegies = new ArrayList<>();
        startegies.add(new UpperCase());
        startegies.add(new LowerCase());
        startegies.add(new TitleCase());

        String text = "hola comunida java";

        for(Formatter f: startegies){
            System.out.println(f.format(text));
        }
    }


}
