/*
* Create an array of ten random integers using a random number generator. Output:
• the biggest number in the array;
• the sum of positive numbers;
• count the number of negative numbers.
• determine whether there are more negative or positive values in the array. If there are
more negative values, output "There are more negative values in the array.
" Otherwise,
output "There are more positive values in the array.
" If the counts are equal, output
"There are an equal number of positive and negative values in the array.
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Arrays;

public class practicalTask3 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        int biggest = randomArray[0];
        int sumPosit = 0;
        int countNegative = 0;
        int countPosit = 0;

        for(int i = 0; i < 10; i++){
            randomArray[i] = (int) (Math.random() * 20) - 10;
        }

        for( int number : randomArray ){
            if (number > biggest){
                biggest = number;
            }

            if (number >= 0){
                sumPosit += number;
                countPosit++;
            } else {
                countNegative++;
            }
        }

        System.out.println("Ерей: " + Arrays.toString(randomArray));
        System.out.println("Найбільше значення: " + biggest);
        System.out.println("Сума усіх додатніх чисел: " + sumPosit);
        System.out.println("Кількість відємних символів: " + countNegative);

        if(countPosit > countNegative){
            System.out.println("There are more positive values in the array.");
        } else if (countPosit < countNegative){
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
