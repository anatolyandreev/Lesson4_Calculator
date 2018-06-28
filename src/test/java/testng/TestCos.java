package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCos extends BaseTest {
    @Test (groups = "trigonometric", dependsOnGroups = "logic")
    public void testCos() {
        double a = 30;
        double actual = calculator.cos(a);
        Assert.assertEquals(actual, 0.15425144988758405, "Fail");
    }
}
