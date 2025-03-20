/*
Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
Method encrypt should take a string and return coded string where every letter is moved
on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
return decoded value
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

public class HomeWork1 {
    public static String encrypt(String s, int n){
        String newString = "";

        for (int i = 0; i < s.length(); i++){
            char newChar = (char) (s.charAt(i) + n);
            newString = newString.concat(String.valueOf(newChar));
        }

        return newString;
    }

    public static String decrypt(String s, int n){
        String newString = "";

        for (int i = 0; i < s.length(); i++){
            char newChar = (char) (s.charAt(i) - n);
            newString = newString.concat(String.valueOf(newChar));
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("abc", 3));
        System.out.println(decrypt(encrypt("abc", 3), 3));

    }
}
