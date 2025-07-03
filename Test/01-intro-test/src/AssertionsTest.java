import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void equalsAssertion(){
        int number = 2;
        int otherNumber = 2;
        assertEquals(number, otherNumber);
    }
    @Test
    void notEqualsAssertion(){
        int number = 2;
        int otherNumber = 3;
        assertNotEquals(number, otherNumber);
    }

    @Test
    void arrayEqualsAssertion(){
        char [] expected = { 'j', 'a', 'v', 'a'};
        char [] actual = "java".toCharArray();
        assertArrayEquals(expected, actual, "Array should be equals");
    }
    @Test
    void trueAssertion(){
        assertTrue( 7 > 5 , "the condition is True");
    }

    @Test
    void trueAssertion1(){
        BooleanSupplier condition = () -> 7 > 1;
        assertTrue(condition, "Is True");
    }

    @Test
    void falseAssertion(){
        boolean condition = 7 > 10;
        assertFalse(condition, "Is False");
    }

    @Test
    void notNullAssertion(){
        Object course = new Object();
        assertNotNull(course, "The course should be not null");
    }
}
