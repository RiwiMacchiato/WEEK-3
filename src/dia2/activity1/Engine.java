package dia2.activity1;

public class Engine implements Operable{

    @Override
    public void start() {
        System.out.println("Engine prumpumpum...");
    }

    @Override
    public void stop() {
        System.out.println("Engine stoping...");
    }
    
}
