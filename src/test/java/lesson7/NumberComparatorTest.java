package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {

    @Test
    public void testIsGreaterTrue() {
        NumberComparator comparator = new NumberComparator();
        Assert.assertTrue(comparator.isGreater(10, 5));
    }

    @Test
    public void testIsGreaterFalse() {
        NumberComparator comparator = new NumberComparator();
        Assert.assertFalse(comparator.isGreater(3, 7));
    }
}