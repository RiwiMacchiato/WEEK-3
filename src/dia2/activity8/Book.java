package dia2.activity8;

public class Book extends Document{
    private int pages;

    public Book(String title, int pages) {
        super(title);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    int pages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book - " + super.getTitle() + " - " + pages;
    }
    
}
