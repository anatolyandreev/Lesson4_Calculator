package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    static Calculator calculator;

    @BeforeClass (alwaysRun = true)
    public static void initCalculator(){
        calculator = new Calculator();
    }

    @AfterClass (alwaysRun = true)
    public static void teardown(){
        calculator = null;
    }
}
