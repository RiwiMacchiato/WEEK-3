package Day2.Activity8;

public abstract class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public abstract int pages();

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                '}';
    }
}
