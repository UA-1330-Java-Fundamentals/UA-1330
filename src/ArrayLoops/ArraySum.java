package ArrayLoops;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84, 100};
        //TODO
        System.out.println("The sum of the array elements is: "+calculateSum(array));
    }

    public static int calculateSum(int[] array) {
        //TODO
        int sum = 0;
        for(int i = 0; i < array.length-1; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}
