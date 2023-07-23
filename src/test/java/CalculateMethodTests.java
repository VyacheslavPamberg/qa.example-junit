
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateMethodTests {
    private CalculateMethods calculateMethods;

    @BeforeEach
    public  void  initTests(){
        calculateMethods = new CalculateMethods();
    }
    @Test
    public void testDivide(){
        assertEquals(10, calculateMethods.divide(100, 10));
    }

    @Test
    public void  testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100, 0));
    }
}
