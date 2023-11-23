public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    // subract method
    public int subtract(int x, int y) {
        return x - y;
    }

    // multiplying x and y method
    public int multiply(int x, int y) {
        return x*y;
    }

    // divide x and y method
    public int divide(int x, int y) {
        return x/y;
    }

    //even method
    public boolean isEven(int i) {
        return i % 2 == 0;
    }

    //array method
    public int[] incrementArray(int[] values) {
        int[] newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i] + 1;
        }
        return newValues;
    }
}
