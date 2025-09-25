
import models.CsvProcess;
import models.JsonProcess;

public class Main {
    public static void main(String[] args) throws Exception {
        CsvProcess csvProcess = new CsvProcess();
        JsonProcess jsonProcess = new JsonProcess();

        csvProcess.execute();
        System.out.println("");
        jsonProcess.execute();
    }
}
