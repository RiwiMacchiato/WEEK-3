package models;

public class Engine implements Operable{
    private int id;
    private String name;
    private String type;

    public Engine(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getType(){
        return type;
    }
    
    @Override
    public void start() {
        System.out.println("Turning on engine " + this.type);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off engine " + this.type);
    }
    
    public void stop() {
        turnOff();
    }
}


