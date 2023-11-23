import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void testMultiply(int x, int y) {
        int expected = 10;

        int actual = calculator.multiply(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    // divide code change
    public void testDivide(int x, int y) {
        int expected = 3;

        int actual = calculator.divide(6, 2);

        assertEquals(expected, actual);
    }
}
