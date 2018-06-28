package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestIsNegative extends BaseTest {
    @Test
    public void testIsPositive() {
        long a = -8;
        boolean actual = calculator.isNegative(a);
        Assert.assertTrue(actual);
    }
}
