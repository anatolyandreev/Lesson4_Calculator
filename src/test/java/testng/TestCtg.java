package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCtg extends BaseTest {
    @Test
    public void testCtg() {
        double a = 3;
        double actual = calculator.ctg(a);
        double expected = (Math.pow(2.718281828, a) - Math.pow(2.718281828, a)) / (Math.pow(2.718281828, a) + Math.pow(2.718281828, a));
        Assert.assertEquals(actual, expected, "Fail");
    }
}
