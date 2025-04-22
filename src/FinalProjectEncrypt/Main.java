package FinalProjectEncrypt;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, enter the cipher type (caesar or xor): ");
        String cipherType = inputReaderString();

        System.out.println("Please, enter the target operation (enc or dec): ");
        String targetOperation = inputReaderString();

        System.out.println("Please, enter the message to process: ");
        String message = inputReaderString();
        if (message.isEmpty() && args.length > 2) {
            message = args[2];
        }

        System.out.println("Please, enter the int key (between 0...25): ");
        int key = inputReaderInt();
        if ((key < 0 || key > 25) && args.length > 1) {
            key = Integer.parseInt(args[1]);
        }

        FileManager fm = new FileManager();
        String content = fm.read("files/input.txt");
        String result = "";

        if (cipherType.equals("caesar")) {
            CaesarCipher cipher = new CaesarCipher();
            if (targetOperation.equals("dec")) {
                result = cipher.decrypt(message, key);
                fm.write("files/output.txt", cipher.decrypt(content, key));
            } else {
                result = cipher.encrypt(message, key);
                fm.write("files/output.txt", cipher.encrypt(content, key));
            }
        } else if (cipherType.equals("xor")) {
            XorCipher cipher = new XorCipher();
            if (targetOperation.equals("dec")) {
                result = cipher.decrypt(message, key);
                fm.write("files/output.txt", cipher.decrypt(content, key));
            } else {
                result = cipher.encrypt(message, key);
                fm.write("files/output.txt", cipher.encrypt(content, key));
            }
        } else {
            System.out.println("Unknown cipher type.");
        }

        System.out.println("Result: " + result);
        SCANNER.close();
    }


    public static String inputReaderString() {
        try {
            return SCANNER.nextLine().trim().toLowerCase();
        } catch (Exception e) {
            throw new RuntimeException("Wrong input string");
        }
    }

    public static int inputReaderInt() {
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Wrong input integer");
        }
    }

}

