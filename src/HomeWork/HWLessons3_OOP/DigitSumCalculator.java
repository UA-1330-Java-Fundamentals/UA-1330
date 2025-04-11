public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int digit1 = number / 100;
            int digit2 = (number / 10) % 10;
            int digit3 = number % 10;
            return digit1 + digit2 + digit3;
        }
        // Handle the error if the number is not three digits
        throw new IllegalArgumentException("The input number is not a three-digit number.");
    }

    public static void main(String[] args) {
        System.out.println(calculateDigitSum(193));
    }
}
