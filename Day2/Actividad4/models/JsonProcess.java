package models;

public class JsonProcess extends Process {

    @Override
    public void prepare(){
        System.out.println("Preparing stuff (Json Process)");
    }

    @Override
    public void process() {
        System.out.println("Processing stuff (Json Process)");
    }
}
