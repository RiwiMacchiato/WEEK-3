package Exercises.Activity_1;

public class Fan implements Operable {
    @Override
    public void start() {
        System.out.println("Fan On");

    }

    @Override
    public void stop() {
        System.out.println("Fan Off");
    }
}
