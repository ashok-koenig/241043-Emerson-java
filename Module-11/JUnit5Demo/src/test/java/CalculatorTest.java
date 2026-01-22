import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @Test
    void testAdd(){
//        Calculator calc = new Calculator();
        Assertions.assertEquals(5, calc.add(2,3));
    }

    @Test
    void testMultiply(){
//        Calculator calc = new Calculator();
        Assertions.assertEquals(30, calc.multiply(5, 6));
    }

    @Test
    void testIsEvenWithEvenNumber(){
        Assertions.assertTrue(calc.isEven(8));
    }

    @Test
    void testIsEvenWithOddNumber(){
        Assertions.assertFalse(calc.isEven(5));
    }
}
