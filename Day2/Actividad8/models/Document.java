package models;

public abstract class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int pages();
}
