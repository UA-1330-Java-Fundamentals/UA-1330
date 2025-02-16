package ArrayLoops;

public class MaxElementFinder {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array: " + maxElement);
    }

    public static int findMaxElement(int[] array) {
        //TODO
        int maxElem = array[0];
        for(int i = 0; i<array.length;i++)
        {
            if(maxElem<array[i])
            {
                maxElem=array[i];
            }
        }

        return maxElem;
    }
}
