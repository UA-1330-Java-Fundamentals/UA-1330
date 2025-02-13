/*
Create a do-while loop that prompts the user to enter two numbers and calculates their
sum. After displaying the result, the program should ask the user if they want to perform
the operation again. If the user inputs a positive response, the loop should repeat;
otherwise, it should terminate.
*/

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Scanner;

public class homeWork2 {

    public static int calcSum(int firstNum, int secondNum){
        int sum = firstNum + secondNum;
        System.out.println("Сумою є " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repit = false;

        do{
            System.out.println("Введіть перше число: ");
            int firstNum = sc.nextInt();
            System.out.println("Введіть друге число: ");
            int secondNum = sc.nextInt();
            calcSum(firstNum, secondNum);
            sc.nextLine();

            System.out.println("Повторимо?(так/ні) - ");
            String repitText = sc.nextLine();
            if (repitText.equals("так")){
                repit = true;
            } else {
                repit = false;
            }
        }while (repit);
    }
}
