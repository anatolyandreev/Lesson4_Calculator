package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestIsNegative extends BaseTest {
    @DataProvider(name = "values")
    public Object[][] dataForTestIsNegative() {
        return new Object[][]{
                {-2},
                {0},
                {3}};
        }

    @Test(groups = "logic", dataProvider = "values")
    public void testIsNegative(long a) {
        boolean actual = calculator.isNegative(a);
        Assert.assertTrue(actual, "Fail");
    }
}
