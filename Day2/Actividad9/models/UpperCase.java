package models;

public class UpperCase implements Formatter {
    @Override
    public String format(String s) {
        return s.toUpperCase();
    }
}
