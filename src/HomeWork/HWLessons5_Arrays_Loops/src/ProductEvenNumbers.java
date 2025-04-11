import java.util.Scanner;

public class ProductEvenNumbers {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input number: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int product = 1;
        int i = 0;
        if (arr[i] < 0) {
            System.out.println("Haven't positiv numbers");
        } else {
            for (; i < arr.length; i++) {
                if (arr[i] > 0) {
                    product = product * arr[i];
                }
            }
            System.out.println("Product of even numbers " + product);
        }

    }
}
