import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Words {
    static class ByLength implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            if (str1.length() > str2.length()) {
                return -1;
            } else if (str1.length() < str2.length()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        String str = "I am learning Java Fundamental";
        String pattern = "\\b(\\w+)\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(str.substring(m.start(), m.end()));
        }
        System.out.println("Array list: " + list);
        List<String> list1 = new ArrayList<>(list);
        list1.sort(new ByLength());
        System.out.println("Sorted array list: " + list1);
        System.out.println("Longest word is: " + list1.get(0));
        System.out.println("Number of letters in the longest word: " + list1.get(0).length());
        System.out.println("Second word of the sentence in reverse order: " + list.get(3));
    }
}
