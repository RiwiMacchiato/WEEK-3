package Exercises.Activity_8;

public class Book extends Documents{

    private int numPages;

    public Book(String title, int pages) {
        super(title);
        this.numPages = pages;
    }

    @Override
    int pages() {
        return 0;
    }
}
