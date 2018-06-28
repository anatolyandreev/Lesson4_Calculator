package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    static Calculator calculator;

    @BeforeClass
    public static void initCalculator(){
        calculator = new Calculator();
    }

    @AfterClass
    public static void teardown(){
        calculator = null;
    }
}
