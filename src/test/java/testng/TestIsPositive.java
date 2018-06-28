package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsPositive extends BaseTest {
    @Test (groups = "logic")
    public void testIsPositive() {
        long a = 2;
        boolean actual = calculator.isPositive(a);
        Assert.assertTrue(actual, "Fail");
    }
}
