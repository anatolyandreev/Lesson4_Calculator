package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsPositive extends BaseTest {
    @Test
    public void testIsPositive() {
        long a = 2;
        boolean actual = calculator.isPositive(a);
        Assert.assertTrue(actual, "Fail");
    }
}
