package junit;


import org.junit.Assert;
import org.junit.Test;

public class TestSumDouble extends BaseTest {
    @Test
    public void testSumDouble() {
        double a = 3.575;
        double b = 0;
        double actual = calculator.sum(a, b);
        Assert.assertEquals(3.575, actual);
    }
}
