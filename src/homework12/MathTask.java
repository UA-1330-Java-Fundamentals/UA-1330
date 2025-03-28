package homework12;

import java.util.Scanner;

/*
Create div() method, which calculates the dividing of two double type numbers. In main()
method input 2 double numbers and call this method. Catch all exceptions.

 */
public class MathTask {

    static double div( double a, double b){
        if( b == 0.0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
    private static double readDouble(String prompt){
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                System.out.println(prompt);
                return Double.parseDouble(scan.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("It should be a double number.");
            }
        }
    }

    public static void main(String[] args) {
       while(true) {
           try {
               double a = readDouble("Enter double number a : ");
               double b = readDouble("Enter double number b : ");

               double result = div(a, b);
               System.out.println("Result of " + a + " / " + b + " = " + result);
               break;
           } catch (ArithmeticException e) {
               System.out.println(e.getMessage());
           } catch (Exception e) {
               System.out.println("An unexpected error occurred: " + e.getMessage());
           }
       }


        //System.out.println(div( 5.5 , 0.0 ));
    }
}
