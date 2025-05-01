package com.softserve.edu.hw13FunctInterface;

import java.util.function.BiFunction;

public class Encription {
    public static void main(String[] args) {
        // Encryption
        BiFunction<String, Integer, String> encrypt = (text, shift) -> {
            StringBuilder result = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    char shifted = (char) (base + (c - base + shift) % 26);
                    result.append(shifted);
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        };

        // Decryption
        BiFunction<String, Integer, String> decrypt = (text, shift) -> {
            StringBuilder result = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    //to get numeric code separate for lower- and uppercases
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    // +26 to avoid negative result
                    char shifted = (char) (base + (c - base - shift + 26) % 26);
                    result.append(shifted);
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        };

        // test
        String original = "Abc xyZ";
        String encrypted = encrypt.apply(original, 3);
        String decrypted = decrypt.apply(encrypted, 3);

        System.out.println("Original:   " + original);
        System.out.println("Encrypted:  " + encrypted);
        System.out.println("Decrypted:  " + decrypted);
    }
}
