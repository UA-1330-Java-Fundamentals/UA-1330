import java.util.Scanner;

public class SumOrProductNumber {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input number: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (arr[i] <= 0) {
                allPositive = false;
                break;
            }
        }
        if (allPositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += arr[i];
            }
            System.out.println("Summ of first 5 numbers " + sum);

        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product = product * arr[i];
            }
            System.out.println("Product of last 5 numbers " + product);

        }

    }
}


