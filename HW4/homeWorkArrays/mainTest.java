package homeWorkArrays;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void month() {
        assertEquals(main.month(),13);
    }

    @org.junit.jupiter.api.Test
    void firstFive() {
        assertNotEquals(0,main.firstFive());
    }

    @org.junit.jupiter.api.Test
    void position() {

       assertEquals(main.position(),6);

    }

    @org.junit.jupiter.api.Test
    void brakeMinus() {
        assertNotEquals(1,main.brakeMinus());
    }
}