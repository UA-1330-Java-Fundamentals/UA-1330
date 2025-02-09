import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84};
        System.out.println("The sum of the array elements is: " + calculateSum(array));
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        if (array.length != 10) {
            System.out.println("Need 10 elements");
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
