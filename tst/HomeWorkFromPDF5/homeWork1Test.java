package HomeWorkFromPDF5;

import HomeWorkFromPDF.HomeWorkFromPDF5.homeWork1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class homeWork1Test {
    @Test
    public void checkMonthNumber1(){
        int expected = 31;
        int actual = homeWork1.monthNumber(1, new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMonthNumber2(){
        int expected = 31;
        int actual = homeWork1.monthNumber(12, new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMonthNumber3(){
        int expected = 0;
        int actual = homeWork1.monthNumber(14, new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31});
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkNumbersAndCalculatesTheSum1(){
        int expected = 16;
        int actual = homeWork1.numbersAndCalculatesTheSum(new int[]{3, 8, 1, 3, 1, 3, 3, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNumbersAndCalculatesTheSum2(){
        int expected = 18;
        int actual = homeWork1.numbersAndCalculatesTheSum(new int[]{-3, 8, 1, 3, 1, 3, 3, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSecondPositive1(){
        int expected = 2;
        int actual = homeWork1.secondPositive(new int[]{-3, 8, 1, 3, 1, 3, 3, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSecondPositive2(){
        int expected = 4;
        int actual = homeWork1.secondPositive(new int[]{-3, 8, -1, -3, 1, 3, 3, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSecondPositive3(){
        int expected = -1;
        int actual = homeWork1.secondPositive(new int[]{-3, -8, -1, -3, -1, 3, -3, -1, -2, -1});
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkMinimumValue1(){
        int[] expected = new int[]{0, 7};
        int[] actual = homeWork1.minimumValue(new int[]{3, 8, 1, 3, 1, 3, 3, 0, 2, 1});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkMinimumValue2(){
        int[] expected = new int[]{-1, 9};
        int[] actual = homeWork1.minimumValue(new int[]{3, 8, 1, 3, 1, 3, 3, 0, 2, -1});
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void checkProduct1(){
        int expected = 16;
        int actual = homeWork1.product(new int[]{3, 8, 1, 3, 1, 3, 3, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkProduct2(){
        int expected = -32;
        int actual = homeWork1.product(new int[]{3, 8, -2, 3, 1, 3, 3, 1, 2, 1});
        Assertions.assertEquals(expected, actual);
    }
}
