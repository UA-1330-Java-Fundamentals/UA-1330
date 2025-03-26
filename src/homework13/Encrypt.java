package homework13;

import java.util.function.Function;
import java.util.stream.*;

/*
Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
Method encrypt should take a string and return coded string where every letter is moved
on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
return decoded value
 */
public class Encrypt {
    static String encrypt(String s, int n){
        //Function<Character, Character> encrypted = a -> (char) ('a' + n);
        String encryptedText = s.chars()
                .mapToObj(x -> {
                    if (Character.isLowerCase(x)) {
                        return String.valueOf((char) ((x - 'a' + n) % 26 + 'a'));
                    } else if (Character.isUpperCase(x)) {
                        return String.valueOf((char) ((x - 'A' + n) % 26 + 'A'));
                    } else {
                        return String.valueOf((char) x);
                    }
                })
        .collect(Collectors.joining());

        return encryptedText;
    };
    static String decrypt(String s, int n){
        String decryptedText = s.chars()
                .mapToObj(x -> {
                    if (Character.isLowerCase(x)) {
                        return String.valueOf((char) ((x - 'a' - n + 26) % 26 + 'a'));
                    } else if (Character.isUpperCase(x)) {
                        return String.valueOf((char) ((x - 'A' - n + 26) % 26 + 'A'));
                    } else {
                        return String.valueOf((char) x);
                    }
                })
                .collect(Collectors.joining());

        return decryptedText;
    };


    public static void main(String[] args) {
        String testText = "ABC";
        System.out.println(encrypt(testText, 3));
        System.out.println(decrypt("def", 3));
    }
}


