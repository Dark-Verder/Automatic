package lesson7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @Test
    void testFactorialOfFive() {
        FactorialCalculator calculator = new FactorialCalculator();

        int result = calculator.factorial(5);

        assertEquals(120, result);
    }
}