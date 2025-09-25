package Day2.Activity9;

public class TitleCase implements Formatter{
    @Override
    public String format(String s) {
        if (s == null || s.isEmpty()) return s;

        String[] words = s.toLowerCase().split("");
        StringBuilder result = new StringBuilder();

        for (String word: words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();

    }
}
