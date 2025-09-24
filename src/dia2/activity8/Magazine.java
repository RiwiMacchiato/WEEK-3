package dia2.activity8;

public class Magazine extends Document{
    private int pagesPerEdition;

    public Magazine(String title, int pagesPerEdition) {
        super(title);
        this.pagesPerEdition = pagesPerEdition;
    }

    public int getPagesPerEdition() {
        return pagesPerEdition;
    }

    public void setPagesPerEdition(int pagesPerEdition) {
        this.pagesPerEdition = pagesPerEdition;
    }

    @Override
    int pages() {
        return pagesPerEdition;
    }

    @Override
    public String toString() {
        return "Magazine: " + super.getTitle() + " - " + pagesPerEdition;
    }

}
