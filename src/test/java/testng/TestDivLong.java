package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDivLong extends BaseTest {
    @Test
    public void testDivLong() {
        long a = 20;
        long b = 2;
        long actual = calculator.div(a, b);
        Assert.assertEquals(actual,10, "Fail: " + a + " not equals " + b);
    }
}
