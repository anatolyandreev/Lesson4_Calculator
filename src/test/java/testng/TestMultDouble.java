package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultDouble extends BaseTest{
    @Test
    public void testMultDouble() {
        double a = -3.8;
        double b = 3;
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual,-12.0, "Fail: " + a + " not equals " + b);
    }
}
