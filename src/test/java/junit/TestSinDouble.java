package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestSinDouble extends BaseTest {
    @Test
    public void testSinDouble() {
        double a = 8.0;
        double actual = calculator.sin(a);
        System.out.println(Math.sin(a));
        Assert.assertEquals(0.9893582466233818, actual, 0.001);
    }
}
