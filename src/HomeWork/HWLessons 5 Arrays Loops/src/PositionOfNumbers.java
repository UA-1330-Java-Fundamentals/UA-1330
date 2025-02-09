import java.util.Scanner;

public class PositionOfNumbers {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input number: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of 2nd positiv numbers " + i);
                return;
            }
        }
        System.out.println("Not enought positiv numbers");
    }
}


