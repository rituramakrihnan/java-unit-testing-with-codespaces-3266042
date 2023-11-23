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

    // mutiply code change
    public int multiply(int x, int y) {
        int expected = 10;

        int actual = calculator.multiply(5, 2);

        assertEquals(expected, actual);
    }
}
