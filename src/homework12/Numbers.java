package homework12;

import java.util.Scanner;

/*
Create a method readNumber(int start, int end), that read from console integer number
and return it, if it is in the range [start...end]. If an invalid number or non-number text is
read, the method should throw an exception.
Using this method write a method main(), that must enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */
public class Numbers {
    private static final Scanner scan = new Scanner(System.in);

    static int readNumber(int start, int end) {

        while(true) {
            try {
                System.out.println("Enter an integer number beetween " + start + " and " + end);
                int number = Integer.parseInt(scan.nextLine());

                if (number < start || number > end) {
                throw new IllegalArgumentException("Number is not in the range");
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    public static void main(String[] args) {
        //System.out.println(readNumber(1, 10));
        try {
            int[] numbers = new int[10];
            int start = 1;
            int end = 100;

            for (int i = 0; i < 10; i++) {
                numbers[i] = readNumber(start, end);
                start = numbers[i];
            }

            System.out.println("Your entered numbers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } finally {
            scan.close();
        }

    }
}
