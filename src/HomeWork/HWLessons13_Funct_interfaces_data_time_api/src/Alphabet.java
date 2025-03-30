import java.util.*;

public class Alphabet {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String s, int n) {
        s = s.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < s.length(); i++) {
            int charPosition = alpha.indexOf(s.charAt(i));
            if (charPosition == -1) {
                cipherText += s.charAt(i);
                continue;
            }
            int keyVal = (n + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static String decrypt(String s, int n) {
        encrypt(s, n);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your letters: ");
        String s = sc.nextLine();
        System.out.println("Write number to move: ");
        int n = sc.nextInt();
        System.out.println("Encrypt text is: " + encrypt(s, n));
        System.out.println("Decrypt text is: " + decrypt(s, n));

    }
}
