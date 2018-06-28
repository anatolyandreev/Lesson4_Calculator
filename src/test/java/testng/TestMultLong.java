package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultLong extends BaseTest{
    @Test (groups = "arithmetic")
    public void testMultLong() {
        long a = 3;
        long b = 5;
        long actual = calculator.mult(a, b);
        Assert.assertEquals(actual,15, "Fail: " + a + " not equals " + b);
    }
}
