import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void equalsAssertion() {
        int number = 2;
        int otherNumber = 2;

        assertEquals(number, otherNumber);
    }


    @Test
    void notEqualsAssertion() {
        int number = 2;
        int otherNumber = 3;

        assertNotEquals(number, otherNumber);
    }


    @Test
    void arrayEqualsAssertion() {
        char [] expected = {'J', 'a', 'v', 'a'};
        char [] actual = "Java".toCharArray();

        assertArrayEquals(expected, actual, "Arrays should be equal");
    }


    @Test
    void trueAssertion() {
        assertTrue(7 > 1, "7 is greater than 1");
    }


    @Test
    void trueAssertion1() {
        BooleanSupplier condition = () -> 7 > 1;
        assertTrue(condition, "7 is greater than 1");
    }


    @Test
    void falseAssertion() {
        boolean condition=  7 > 10;

        assertFalse(condition, "7 is not greater than 10");
    }


    @Test
    void notNullAssertion() {
        Object course = new Object();

        assertNotNull(course, "The course should not be null");
    }


    @Test
    void nullAssertion() {
        Object course = null;

        assertNull(course, "The course should be null");
    }


    @Test
    void SameAssertion() {
        String course = "Backend";
        Optional<String> optional = Optional.of(course);

        assertSame(course, optional.get());
    }


    @Test
    void NotSameAssertion() {
        String course = "Backend";
        String otherCourse = "POO";
        Optional<String> optional = Optional.of(otherCourse);

        assertNotSame(course, optional.get());
    }


    @Test
    void allAssertion() {
        assertAll(
                () -> assertEquals(4, 2 *2),
                () -> assertEquals("backend", "BACKEND".toLowerCase()),
                () -> assertNotEquals(3,2),
                () -> assertNull(null, "actual is null")
        );
    }


    @Test
    void iterableEqualsAssertion() {
        Iterable<String> arrayList = new ArrayList<>(asList("Java", "Junit", "Test"));
        Iterable<String> linkedList = new LinkedList<>(asList("Java", "Junit", "Test"));

        assertIterableEquals(arrayList, linkedList);
    }


    @Test
    void throwsAssertion1() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("la");
        });

    }


    @Test
    void timeOutAssertion() {
        assertTimeout(
                Duration.ofSeconds(2),
                () -> {
                    Thread.sleep(1000);
                }
        );
    }


    @Test
    void timeOutPreemptivelyAssertion() {
        assertTimeoutPreemptively(
                Duration.ofSeconds(1),
                () -> {
                    Thread.sleep(10000);
                }
        );
    }


    @Test
    void linesMatchAssertion() {
        List<String> expected = asList("Java", "11", "JUnit");
        List<String> actual = asList("Java", "11", "JUnit");

        assertLinesMatch(expected, actual);
    }



}
