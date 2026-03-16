package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {

    @Test
    public void testAddition() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        Assert.assertEquals(calculator.add(3, 4), 7);
    }

    @Test
    public void testSubtraction() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testMultiplication() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        Assert.assertEquals(calculator.multiply(3, 4), 12);
    }

    @Test
    public void testDivision() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        Assert.assertEquals(calculator.divide(6, 3), 2);
    }
}
