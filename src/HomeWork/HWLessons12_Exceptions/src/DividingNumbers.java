import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class DividingNumbers {
    public static double div(double a, double b) throws Exception {
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        double a = 0;
        double b = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("a = ");
            a = Double.parseDouble(br.readLine());
            System.out.print("b = ");
            b = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException message: " + e.getMessage());
            e.printStackTrace();
            return;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException message: " + e.getMessage());
            e.printStackTrace();
            return;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException message: " + e.getMessage());
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("IOException message: " + e.getMessage());
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
            e.printStackTrace();
            return;
        } finally {
            System.out.println("Finally done");
        }
        System.out.println("Result div method: " + DividingNumbers.div(a, b));

    }
}
