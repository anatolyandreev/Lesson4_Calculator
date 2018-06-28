package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestIsPositive extends BaseTest {
    @Parameters ({"number"})
    @Test (groups = "logic")
    public void testIsPositive(long a) {
        boolean actual = calculator.isPositive(a);
        Assert.assertTrue(actual, "Fail");
    }
}
