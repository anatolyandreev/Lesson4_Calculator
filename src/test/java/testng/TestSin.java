package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSin extends BaseTest {
    @Test (groups = "trigonometric", dependsOnGroups = "logic")
    public void testSin() {
        double a = 30;
        double actual = calculator.sin(a);
        Assert.assertEquals(actual, -0.9880316240928618, "Fail");
    }
}
