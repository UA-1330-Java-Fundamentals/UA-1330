package homework4;
/*
Write a static method checkIfAdult () that determines if a user is an adult based on their age. The method should take an integer as input parameter and return a string message indicating whether the user is an adult. Additionally, the method should validate that the input age is a positive number and does not exceed 150 years. If the input age is not valid, the method should return an error message.

Requirements:
Create a method named checkIfAdult.
The method should take an integer parameter age.
If age is less than or equal to 0, the method should return the message: "Invalid age. Age must be a positive number."
If age is greater than 150, the method should return the message: "Invalid age. Age must not exceed 150 years."
If age is 18 or older, the method should return the message: "You are an adult."
If age is less than 18, the method should return the message: "You are not an adult."
 */

public class AgeChecker {

    public static String checkIfAdult( int age){
        if ( age <= 0 ){
            return "Invalid age. Age must be a positive number.";
        } if ( age > 150 ){
            return "Invalid age. Age must not exceed 150 years.";
        } if ( age >= 18 ) {
            return "You are an adult.";
        } else {
            return "You are not an adult.";
        }
    }
}
