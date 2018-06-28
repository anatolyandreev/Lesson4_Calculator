package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestCosDouble extends BaseTest {
    @Test
    public void testCosDouble() {
        double a = 8.0;
        double actual = calculator.cos(a);
        Assert.assertEquals(-0.14550003380861354, actual, 0.001);
    }
}
