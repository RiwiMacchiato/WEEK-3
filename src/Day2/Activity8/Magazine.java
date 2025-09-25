package Day2.Activity8;

public class Magazine extends Document{

    private int pagesPerEdition;

    public Magazine(String title, int pagesPerEdition) {
        super(title);
        this.pagesPerEdition= pagesPerEdition;
    }

    @Override
    public int pages() {
        return pagesPerEdition;
    }
}
