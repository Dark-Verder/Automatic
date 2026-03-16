package lesson7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {

    @Test
    void testIsGreaterTrue() {
        NumberComparator comparator = new NumberComparator();
        assertTrue(comparator.isGreater(10, 5));
    }

    @Test
    void testIsGreaterFalse() {
        NumberComparator comparator = new NumberComparator();
        assertFalse(comparator.isGreater(3, 7));
    }
}
