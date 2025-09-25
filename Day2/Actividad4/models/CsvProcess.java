package models;

public class CsvProcess extends Process {
    
    
    @Override
    public void prepare(){
        System.out.println("Prepare stuff (Csv Process)");
    }
    
    @Override
    public void process(){
        System.out.println("Processing stuff (Csv Process)");
    }
}
