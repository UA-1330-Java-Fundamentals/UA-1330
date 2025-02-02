package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class MathTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Input the third number:");
        int number3 = scanner.nextInt();

        System.out.println("The smallest number is " + findSmallestNumber(number1, number2, number3));
    }

    public static int findSmallestNumber( int number1, int number2, int number3){
        int[] array = { number1, number2, number3 };
        Arrays.sort(array);
        return array[0];
    }


}
