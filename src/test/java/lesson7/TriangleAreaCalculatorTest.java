package lesson7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleAreaCalculatorTest {

    @Test
    void testTriangleArea() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        double result = calculator.calculateArea(10, 4);

        assertEquals(20.0, result);
    }
}

