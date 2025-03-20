/*
Create div() method, which calculates the dividing of two double type numbers. In main()
method input 2 double numbers and call this method. Catch all exceptions.
*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

public class HomeWork1 {
    public static double div(double firstNumber, double secondNumber){
        double result = 0;

        try {
            if (secondNumber == 0) {
                throw new ArithmeticException("Помилка: ділення на нуль.");
            }
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Інша помилка: " + e.getMessage());
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        double res = div(30, 0);
        System.out.println(res);
    }
}
