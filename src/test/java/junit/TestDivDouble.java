package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestDivDouble extends BaseTest {
    @Test
    public void testDivDouble() {
        double a = 8.0;
        double b = 4.0;
        double actual = calculator.div(a, b);
        Assert.assertEquals(2, actual, 0.001);
    }
}
