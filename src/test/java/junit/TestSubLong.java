package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestSubLong extends BaseTest {
    @Test
    public void testSubLong() {
        long a = 3;
        long b = -5;
        long actual = calculator.sub(a, b);
        Assert.assertEquals(8, actual);
    }
}
