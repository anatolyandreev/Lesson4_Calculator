package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsNegative extends BaseTest {
    @Test
    public void testIsNegative() {
        long a = -2;
        boolean actual = calculator.isNegative(a);
        Assert.assertTrue(actual, "Fail");
    }
}
