package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubLong extends BaseTest{
    @Test
    public void testSubLong() {
        long a = 3;
        long b = 5;
        long actual = calculator.sub(a, b);
        Assert.assertEquals(actual,-2, "Fail: " + a + " not equals " + b);
    }
}
