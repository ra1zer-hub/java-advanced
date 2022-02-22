import homework4.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Artamonov Aleksandr
 */

public class CalculatorTest {

    @Test
    public void addition() throws Exception {
        Calculator calculator = new Calculator(18.7, "+", 17.2);
        assertEquals(calculator.getResult(), 35.9, "Результат сложение не верный");
    }

    @Test
    public void subtraction() throws Exception {
        Calculator calculator = new Calculator(35.9, "-", 17.2);
        assertEquals(calculator.getResult(), 18.7, "Результат вычитания не верный");
    }

    @Test
    public void multiplication() throws Exception {
        Calculator calculator = new Calculator(9.6, "*", 8.3);
        assertEquals(calculator.getResult(), 79.68, "Результат умножения не верный");
    }

    @Test
    public void division() throws Exception {
        Calculator calculator = new Calculator(18.22, "/", 4.35);
        assertEquals(calculator.getResult(), 4.1885, 0.0001, "Результат умножения не верный");
    }

    @Test
    public void divisionByZero() {
        Calculator calculator = new Calculator(18, "/", 0);
        Throwable throwable = assertThrows(Exception.class, calculator::getResult);
        assertNotNull(throwable.getMessage());
    }

    @Test
    public void notValidSign() {
        Calculator calculator = new Calculator(6, "_", 2);
        Throwable throwable = assertThrows(Exception.class, calculator::getResult);
        assertNotNull(throwable.getMessage());
    }
}
