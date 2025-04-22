package FinalProjectEncrypt;

public class XorCipher implements CipherAlgorithm {
    @Override
    public String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            result.append((char) (character ^ key));
        }
        return result.toString();
    }

    @Override
    public String decrypt(String message, int key) {
        return encrypt(message, key);
    }
}
