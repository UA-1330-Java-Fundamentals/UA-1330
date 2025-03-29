import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Range {

    public static int readNumber(int start, int end) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;
        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            throw new Exception(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(br.readLine());
        }
        if (number <= start || number >= end) {
            throw new Exception("Number not in range (" + start + "..." + end + "): " + number);
        }
        return number;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int [] numbers = new int [10];
            int start = 0;
            int end = 100;
            System.out.println("Input 10 numbers such that 1 < a1 < a2 < ... < a10 < 100: ");
            for (int i = 0; i < 10; i++) {
                try {
                    numbers[i] = readNumber(start, end);
                    start = numbers[i];
                } catch (Exception e) {
                    System.out.println("Error" + e.getMessage());
                    i --;
                }
            }
            System.out.println("Valid numbers: ");
            for (int num : numbers) {
                System.out.println(num);
            }

        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());

        } finally {
            System.out.println("Finally done");
        }

    }
}
