package models;

public class Book extends Document {
    private int pages;

    public Book(String title, int pages) {
        super(title);
        this.pages = pages;
    }

    @Override
    public int pages() {
        return pages;
    }
}
