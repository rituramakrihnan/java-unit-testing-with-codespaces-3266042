import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSub(){
         int expected = 3;

        int actual = calculator.subtract(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    // mutiply code change
    public void testMultiply() {
        int expected = 10;

        int actual = calculator.multiply(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    // divide code change
    public void testDivide() {
        int expected = 3;

        int actual = calculator.divide(6, 2);

        assertEquals(expected, actual);
    }

    // check even method

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    //check odd method

    @Test
    public void testIsOdd() {
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }

     @Test
    public void testIncrementArray() {
        int[] expected = new int[]{2, 3, 4};
        int[] actual = calculator.incrementArray(new int[]{1, 2, 3});
        assertArrayEquals(expected, actual);
    }
}
