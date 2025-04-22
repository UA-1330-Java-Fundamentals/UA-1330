package FinalProjectEncrypt;

public class CaesarCipher implements CipherAlgorithm {
    @Override
    public String encrypt(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            char shifted = (char) (character + offset);
            result.append(shifted);
        }
        return result.toString();
    }
    @Override
    public String decrypt(String message, int offset) {
        return encrypt(message, -offset);
    }
}