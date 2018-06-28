package junit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

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
