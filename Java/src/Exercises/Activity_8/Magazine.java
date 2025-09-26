package Exercises.Activity_8;

public class Magazine extends Documents{

    private int pagesPerEdition;

    public Magazine(String title, int pagesPerEdition) {
        super(title);
        this.pagesPerEdition = pagesPerEdition;
    }

    @Override
    int pages() {
        return pagesPerEdition;
    }
}
