package Day2.Activity4;

public abstract class Process {

    public final void execute() {
        prepare();
        process();
        finish();
    }

    abstract void prepare();

    abstract void process();

    public void finish() {
        System.out.println("Ok");
    }

}
