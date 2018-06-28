package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestSubDouble extends BaseTest {
    @Test
    public void testSubDouble() {
        double a = 3.575;
        double b = 0;
        double actual = calculator.sub(a, b);
        Assert.assertEquals(3.575, actual, 0.001);
    }
}
