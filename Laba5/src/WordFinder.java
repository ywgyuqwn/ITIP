import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class WordFinder {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        char startingLetter = 't';

        Pattern pattern = Pattern.compile("\\b" + startingLetter + "\\w+");
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }

        System.out.println("Words starting with '" + startingLetter + "': " + words);
    }
}