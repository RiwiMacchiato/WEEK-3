package Exercises.Activity_8;

public abstract class Documents {

    String title;

    public Documents(String title) {
        this.title = title;
    }

    abstract  int pages();
}
