package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestCtgDouble extends BaseTest {
    @Test
    public void testCtgDouble() {
        double a = 8.0;
        double actual = calculator.ctg(a);
        Assert.assertEquals(0.9999997749296758, actual, 0.001);
    }
}
