package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestPowDouble extends BaseTest {
    @Test
    public void testPowDouble() {
        double a = 8.0;
        double b = 4.0;
        double actual = calculator.pow(a, b);
        Assert.assertEquals(4096, actual, 0.001);
    }
}
