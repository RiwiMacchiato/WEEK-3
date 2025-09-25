package models;

public class TitleCase implements Formatter {
    @Override
    public String format(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] words = s.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                result.append(Character.toUpperCase(words[i].charAt(0)))
                      .append(words[i].substring(1));
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }
}
