package homework4;

/*
Write a method that checks if a given number falls within a specified range and determines if the number is even or odd. The method should take three integers as inputs: the number to be checked, the lower bound of the range, and the upper bound of the range. The method should return a string message indicating whether the number is within the range and whether it is even or odd. If the number is not within the range, the method should return an appropriate error message.

Requirements:
Create a method named checkNumberInRangeAndParity.
The method should take three integer parameters: number, lowerBound, and upperBound.
If number is not within the range [lowerBound, upperBound], the method should return the message: "The number {number} is out of the range [{lowerBound}, {upperBound}]."
If number is within the range and is even, the method should return the message: "The number {number} is within the range and is even."
If number is within the range and is odd, the method should return the message: "The number {number} is within the range and is odd."
 */

public class NumberChecker {
    public static String checkNumberInRangeAndParity ( int number,int lowerBound,int upperBound){
        if ( number < lowerBound || number > upperBound){
            return "The number " + number + " is out of the range [" + lowerBound +", " + upperBound + "].";
        } else if ( number % 2 == 0){
            return "The number " + number + " is within the range and is even.";
        } else {
            return "The number " + number + " is within the range and is odd.";

        }
    }
}
