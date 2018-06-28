package junit;

import org.junit.Assert;
import org.junit.Test;

public class TestTgDouble extends BaseTest {
    @Test
    public void testTgDouble() {
        double a = 8.0;
        double actual = calculator.tg(a);
        Assert.assertEquals(1.6197751905438615, actual, 0.001);
    }
}
