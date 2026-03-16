package lesson7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    void testAddition() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void testSubtraction() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void testDivision() {
        ArithmeticOperations calculator = new ArithmeticOperations();
        assertEquals(2, calculator.divide(6, 3));
    }
}