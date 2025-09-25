package models;

public class LowerCase implements Formatter {
    @Override
    public String format(String s) {
        return s.toLowerCase();
    }
}
