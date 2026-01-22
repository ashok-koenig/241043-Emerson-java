import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void testAssertEquals(){
        int expected = 10;
        int actual = 5 + 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAssertTrue(){
        Assertions.assertTrue( 3 < 4);
    }

    @Test
    void testAssertFalse(){
        Assertions.assertFalse(10<5);
    }

    @Test
    void testAssetNull(){
        String str = null;
        Assertions.assertNull(str);
    }

    @Test
    void testAssertNotNull(){
        String str = "JUnit";
        Assertions.assertNotNull(str);
    }

    @Test
    void testAssertArrayEquals(){
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testAssertThrows(){
        Calculator calc = new Calculator();
        Exception exception = Assertions.assertThrows(ArithmeticException.class,
                () -> calc.divide(10,0));
        Assertions.assertEquals("/ by zero", exception.getMessage());
    }
}
