package HomeWorkFromPDF5;

import HomeWorkFromPDF.HomeWorkFromPDF5.homeWork4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class homeWork4Test {
    @Test
    public void testGuessTooHigh() {
        int randomNumber = 5;
        int userGuess = 10;
        String result = homeWork4.guess(randomNumber, userGuess);
        Assertions.assertEquals("Ваше число завелике, спробуйте менше.", result);
    }

    @Test
    public void testGuessTooLow() {
        int randomNumber = 5;
        int userGuess = 3;
        String result = homeWork4.guess(randomNumber, userGuess);
        Assertions.assertEquals("Ваше число замаленьке, спробуйте більше.", result);
    }

    @Test
    public void testGuessCorrect() {
        int randomNumber = 5;
        int userGuess = 5;
        String result = homeWork4.guess(randomNumber, userGuess);
        Assertions.assertEquals("Ви вгадали, правильна відповідь: 5", result);
    }

}
