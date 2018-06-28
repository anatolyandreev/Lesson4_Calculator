package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestMultDouble extends BaseTest {
    @Test
    public void testSubDouble() {
        double a = 3.575;
        double b = 0;
        double actual = calculator.mult(a, b);
        Assert.assertEquals(0, actual, 0.001);
    }
}
