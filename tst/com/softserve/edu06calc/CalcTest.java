package com.softserve.edu06calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void checkAdd1() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 10.001;
        actual = calc.add(5, 5);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void checkAdd2() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 10;
        actual = calc.add(4, 6);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkDiv1() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 5;
        actual = calc.div(20, 4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkDiv2() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 2.5;
        actual = calc.div(20, 8);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDivZero() {
        ArithmeticException thrown =
                Assertions.assertThrows(ArithmeticException.class,
                        () -> { int actual = 23 / 0; });
        System.out.printf("thrown = " + thrown);
    }

}
