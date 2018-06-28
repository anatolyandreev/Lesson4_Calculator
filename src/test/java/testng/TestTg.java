package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTg extends BaseTest {
    @Test (groups = "trigonometric")
    public void testTg() {
        double a = 30;
        a = Math.toDegrees(a);
        double actual = calculator.tg(a);
        Assert.assertEquals(actual, 0.5773502691896257, "Fail");
    }
}
