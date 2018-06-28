package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestIsPositive extends BaseTest {
    @Test
    public void testIsPositive() {
        long a = 8;
        boolean actual = calculator.isPositive(a);
        Assert.assertTrue(actual);
    }
}
