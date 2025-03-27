import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dollar {
    public static void main(String[] args) {
        String text = "Dress cost $1200.00 bag cost $300.00, pen cost $0.50, notebook cost $3.25";
        //String text = "$1.20";
        String pattern = "\\$(\\d+\\.\\d{2})";

        System.out.println("Original text: " + text);
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        List<String> list = new ArrayList<>();

        while (m.find()) {
            System.out.println("Price: " + text.substring(m.start(), m.end()) + " ");
            list.add(text.substring(m.start(), m.end()));
        }
        System.out.println("Price (use Arraylist): " + list);
    }
}
