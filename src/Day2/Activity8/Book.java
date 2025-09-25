package Day2.Activity8;

public class Book extends Document{

    private int Numpages;

    public Book(String title, int Numpages) {
        super(title);
        this.Numpages= Numpages;
    }


    @Override
    public int pages() {
        return Numpages;
    }
}
