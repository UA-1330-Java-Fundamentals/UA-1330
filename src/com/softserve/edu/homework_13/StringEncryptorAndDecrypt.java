/*
 * Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
 * Method encrypt should take a string and return coded string where every letter is moved
 * on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
 * return decoded value
 * */
package com.softserve.edu.homework_13;

public class StringEncryptorAndDecrypt {
    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = (char) (c + n);
            result.append(c);
        }

        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static void main(String[] args) {
        String text = "abc";

        String encryptedText = encrypt(text, 3);
        System.out.println("Encrypted string '" + text + "': " + encryptedText);

        String decryptedText = decrypt(encryptedText, 3);
        System.out.println("Decrypted string '" + encryptedText + "': " + decryptedText);
    }
}
