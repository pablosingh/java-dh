import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.*;
import java.util.function.BooleanSupplier;

import static java.util.Arrays.asList;
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

    @Test
    void nullAssertion(){
        Object object = null;
        assertNull(object, "Should be a null");
    }
    @Test
    void sameAssertion(){
        String course = "Backend";
        Optional<String> optional = Optional.of(course);
        assertSame("Backend", course);
    }
    @Test
    void notSameAssertion(){
        String course = "Backend";
        String otherCourse = "POO";
        Optional<String> optional = Optional.of(course);
        assertNotSame(course, otherCourse);
        assertNotSame(course, optional);
    }

    @Test
    void allAssertions(){
        assertAll(
                ()-> assertEquals(2,2),
                ()-> assertNotEquals(3 , 2*2),
                ()-> assertNull(null, "Should be a null")
        );
    }
    @Test
    void iterableEqualsAssertion(){
        Iterable<String> arrayList = new ArrayList<>(asList("Java", "Junit", "Backend"));
        Iterable<String> linkedList = new LinkedList<>(asList("Java", "Junit", "Backend"));
        assertIterableEquals(arrayList, linkedList);
    }
    @Test
    void throwsAssertion1(){
        Exception exception = assertThrows(NumberFormatException.class, ()-> {
            Integer.parseInt("a");
        });
    }
    @Test
    void timeOutAssertion(){
        assertTimeout(
                Duration.ofSeconds(2),
                ()-> {
                    Thread.sleep(100);
                }
            );
    }

    @Test
    void timeOutPreemptivelyAssertion(){
        assertTimeoutPreemptively(
                Duration.ofSeconds(2),
                ()-> {
                    Thread.sleep(10000);
                }
        );
    }

    @Test
    void linesMatchAssertion(){
        List<String> expected = asList("Java", "123", "Junit");
        List<String> actual = asList("Java", "123", "Junit");
        assertLinesMatch(expected, actual);
    }
}
