package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestMultLong extends BaseTest {
    @Test
    public void testMultLong() {
        long a = 3;
        long b = -5;
        long actual = calculator.mult(a, b);
        Assert.assertEquals(-15, actual);
    }
}
