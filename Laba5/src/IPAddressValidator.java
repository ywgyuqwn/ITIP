import java.util.regex.*;

public class IPAddressValidator {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";

        Pattern pattern = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("Valid IP address!");
        } else {
            System.out.println("Invalid IP address!");
        }
    }
}