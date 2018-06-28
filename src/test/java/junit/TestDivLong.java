package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestDivLong extends BaseTest {
    @Test
    public void testDivLong() {
        long a = 8;
        long b = 2;
        long actual = calculator.div(a, b);
        Assert.assertEquals(4, actual);
    }
}
