package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubDouble extends BaseTest{
    @Test (groups = "arithmetic")
    public void testSubDouble() {
        double a = -3.8;
        double b = 5;
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual,-8.8, "Fail: " + a + " not equals " + b);
    }
}
