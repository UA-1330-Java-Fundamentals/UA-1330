/*
Write a Java program that performs the following tasks and outputs the results:
• Create a string array and sort it.
• Create an array with 5 elements and calculate the average value
• Сheck if the array (any of the previous ones) contains the value ( value enter from the
console). Output the result of the search.
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class ArrayHomeWork{
    private static final Scanner sc = new Scanner(System.in);
    int[] array = {3, 2, 1};
    double numbers = 0.0;
    double count = 0.0;
    boolean found = false;

    public void sort(){
        String[] words = {"a", "b", "d", "c"};
        System.out.println("Не сортований: " + Arrays.toString(words));
        Arrays.sort(words);;
        System.out.println("Сортований: " + Arrays.toString(words));
    }

    public void average(){
        int[] array = {3, 2, 1};
        double numbers = 0.0;

        for(int num : array){
            numbers += num;
        }

        double average = numbers / array.length;
        System.out.println("Середнє число: " + average);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArrayHomeWork that = (ArrayHomeWork) o;
        return Double.compare(numbers, that.numbers) == 0 && Double.compare(count, that.count) == 0 && found == that.found && Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(array), numbers, count, found);
    }

    public void findNumber(){
        int[] array = {3, 2, 1};
        boolean found = false;
        System.out.println("Введіть число для пошуку: ");
        int numberByUser = sc.nextInt();

        for(int i = 0; i <= array.length - 1; i++){
            if(array[i] == numberByUser && !found){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Число є");
        } else {
            System.out.println("Числа нема");
        }


    }
}

public class practicalTask1 {
    public static void main(String[] args) {
        ArrayHomeWork array = new ArrayHomeWork();
        array.sort();
        array.average();
        array.findNumber();
    }
}
