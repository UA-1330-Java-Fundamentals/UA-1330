/*
Write a Java program that asks the user to enter a positive integer and determines
whether it is a prime number. If the number is prime, output a message “Is a prime
number”
. Otherwise, output a message “Is not prime number”
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Scanner;

public class practicalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть додатнє число: ");
        int numberByUser = sc.nextInt();
        boolean itsPrime = true;

        if(numberByUser >= 1){
            for(int i = 2; i < numberByUser; i++){
                if (numberByUser % i != 0){
                    itsPrime = false;
                    break;
                }
            }
        } else {
            System.out.println("Введіть додатнє число!!!!");
        }

        if(itsPrime == true) {
            System.out.println("Це праймове число");
        }else {
            System.out.println("Це не праймове число");
        }
    }
}
