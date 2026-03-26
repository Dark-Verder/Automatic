package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

    @Test
    public void testTriangleArea() {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        double result = calculator.calculateArea(10, 4);

        Assert.assertEquals(result, 20.0);
    }
}