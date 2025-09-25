package Day2.Activity4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        Process csv = new CsvProcess();
        Process json = new JsonProcess();

        csv.execute();

         json.execute();

    }
}
