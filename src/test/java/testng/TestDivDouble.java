package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDivDouble extends BaseTest {
    @Test (groups = "arithmetic")
    public void testMultDouble() {
        double a = -3.8;
        double b = 3;
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual,-1.2666666666666666, "Fail: " + a + " not equals " + b);
    }
}
