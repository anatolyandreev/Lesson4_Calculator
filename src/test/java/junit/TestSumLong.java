package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestSumLong extends BaseTest{
    @Test
    public void testSumLong() {
        long a = 3;
        long b = -5;
        long actual = calculator.sum(a, b);
        Assert.assertEquals(-2, actual);
    }
}
