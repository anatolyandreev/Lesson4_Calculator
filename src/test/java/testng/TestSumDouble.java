package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSumDouble extends BaseTest {
    @Test (groups = "arithmetic")
    public void testSumDouble() {
        double a = 3.575;
        double b = 0;
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual,3.575, "Fail");
    }
}
