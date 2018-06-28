package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPow extends BaseTest {
    @Test
    public void testPow() {
        double a = -3.8;
        double b = -3.7;
        double actual = calculator.pow(a, b);
        Assert.assertEquals(actual,0.004795850246698537, "Fail");
    }
}
