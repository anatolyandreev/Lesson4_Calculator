package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSumLong extends BaseTest {

    @Test
    public void testSumLong() {
        long a = 3;
        long b = -5;
        long actual = calculator.sum(a, b);
        Assert.assertEquals(actual,-2, "Fail: " + a + " not equals " + b);
    }
}
