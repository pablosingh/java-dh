import org.junit.jupiter.api.*;

public class CicloVidaTest {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void regular_testing_method() {
        //...
    }

    @Test
    @Disabled
    void skippedTest() {
        //not executed
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}
