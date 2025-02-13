
package HomeWorkFromPDF5;

import HomeWorkFromPDF.HomeWorkFromPDF5.homeWork2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class homeWork2Test {

    @Test
    public void calcSum1(){
        int expected = 7;
        int actual = homeWork2.calcSum(3,4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSum2(){
        int expected = 1;
        int actual = homeWork2.calcSum(-4,5);
        Assertions.assertEquals(expected, actual);
    }
}
