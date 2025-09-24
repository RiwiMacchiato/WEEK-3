package dia2.activity8;

public abstract class Document {
    private String title;
    
    abstract int pages();

    public Document(String title) {
        this.title = title;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}
