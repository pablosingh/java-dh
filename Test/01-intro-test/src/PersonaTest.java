import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @BeforeAll
    static void initAll(){
        // Se ejecuta una vez antes de cualquier  test
    }

    @BeforeEach
    void init(){
        // Antes de cada test unitario
    }

    @Test
    void regular_testing_method(){
        // Metodo normal de test
    }

    @Test
    @Disabled
    void skippedTest(){
        // Desactivar un metodo
    }

    @AfterEach
    void tearDown(){
        // Despues de cada test
    }

    @AfterAll
    static void tearDownAll(){
        // Despues de todos los test
    }

    @Tag("unit")
    @Test
    void myTest(){
    }

    @Tag("otherTest")
    @Test
    void otherTest(){
        // otro test
    }
}