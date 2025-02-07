public class NumberChecker {
    int number;
    int lowerBound;
    int upperBound;

    public NumberChecker(int number, int lowerBound, int upperBound) {
        this.number = number;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public static String checkNumberInRangeAndParity(int number, int lowerBound, int upperBound) {
        if (number < lowerBound || number > upperBound) {
            return ("The number " + number + " is out of the range [" + lowerBound + ", " + upperBound + "].");
        } else if (number % 2 == 0) {
            return ("The number " + number + " is within the range and is even.");
        } else if ((number % 2 == 1)) {
            return ("The number " + number + " is within the range and is odd.");
        } else {
            return ("Error");
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumberInRangeAndParity(3, 5, 20));
        //checkNumberInRangeAndParity(21, 5, 20);
    }
}
