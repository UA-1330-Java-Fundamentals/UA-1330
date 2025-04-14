package com.softserve.loopsandarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessingGameTest{
    @Test
    public void checkMathRandom(){
        GuessingGame guess = new GuessingGame();
        double actual;

        actual = guess.generateRandomNumber();
        Assertions.assertNotNull(actual);

    }
   @Test
    public void checkCompareTwoNumbers(){
        GuessingGame guess = new GuessingGame();
        int a = 5;
        int b = 3;

        String expected = "Too high, try again";
        String actual = guess.compareTwoNumbers(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void checkCompareTwoNumbers2(){
        GuessingGame guess = new GuessingGame();
        int a = 2;
        int b = 5;

        String expected = "Too low, try again";
        String actual = guess.compareTwoNumbers(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void checkCompareTwoNumbers3(){
        GuessingGame guess = new GuessingGame();
        int a = 5;
        int b = 5;

        String expected = "Numbers are equal";
        String actual = guess.compareTwoNumbers(a,b);
        Assertions.assertEquals(expected,actual);
    }
}
