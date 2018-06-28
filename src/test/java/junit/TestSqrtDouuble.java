package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestSqrtDouuble extends BaseTest {
    @Test
    public void testSqrtDouble() {
        double a = 4.0;
        double actual = calculator.sqrt(a);
        Assert.assertEquals(2, actual, 0.001);
    }
}
