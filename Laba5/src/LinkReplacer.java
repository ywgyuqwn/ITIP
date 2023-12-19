public class LinkReplacer {
    public static void main(String[] args) {
        String text = "Visit our website at http://www.example.com for more information.";
        String replacedText = text.replaceAll("(http[s]?)://[\\w./]+", "<a href=\"$0\">$0</a>");
        System.out.println(replacedText);
    }
}