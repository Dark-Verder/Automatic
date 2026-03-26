package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfFive() {
        FactorialCalculator calculator = new FactorialCalculator();

        int result = calculator.factorial(5);

        Assert.assertEquals(result, 120);
    }
}
