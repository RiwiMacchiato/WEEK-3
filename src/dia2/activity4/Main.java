package dia2.activity4;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Process> processes = new ArrayList<>();

        processes.add(new CsvProcess());
        processes.add(new JsonProcess());

        for(Process process : processes){
            process.execute();
        }

    }

}
