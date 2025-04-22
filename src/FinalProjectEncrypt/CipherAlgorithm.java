package FinalProjectEncrypt;

public interface CipherAlgorithm {
    String encrypt(String message, int offset);
    String decrypt(String message, int offset);
}
