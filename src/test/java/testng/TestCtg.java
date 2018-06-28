package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCtg extends BaseTest {
    @Test (groups = "trigonometric", dependsOnGroups = "logic")
    public void testCtg() {
        double a = 3;
        double actual = calculator.ctg(a);
        System.out.println(Math.tanh(a));
        Assert.assertEquals(actual, 0.9950547536867305, "Fail");
    }
}
