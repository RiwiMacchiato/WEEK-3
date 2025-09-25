package Day2.Activity1;

public class Engine implements  Operable {
    @Override
    public void start() {
        System.out.println("Start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");

    }
}
