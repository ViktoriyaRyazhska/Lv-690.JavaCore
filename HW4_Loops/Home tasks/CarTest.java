package JavaCore;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @BeforeAll
    public static void setUp() {

    }

    @BeforeEach
    public void runBeforeEach() {

    }
    @AfterEach
    void tearDown() {
    }


    @ParameterizedTest
    @MethodSource("typeError")
    public void creationCarTest(String type){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car(type,1972,4500);
       });

    }

    static Stream<String> typeError(){
        return Stream.of("", " ", null);
    }

    @ParameterizedTest
    @ValueSource(ints = {1930,2021,2025})
    public void compareYears(int y) {

        int outYear = 1940;

        Car car = new Car("BMW",y,4500);

        Assertions.assertNotNull(car);

        if (car.getYear() > LocalDate.now().getYear() || car.getYear() <= outYear){
            fail("wrong year "+y);
        }
    }


    @Test
    void sortCars() {

        Car[] cars;
        cars = new Car[4];
        cars[0] = new Car("Chevrolet",1968,5500);
        cars[1] = new Car();
        cars[2] = new Car("Cadillac",1963,4000);
        cars[3] = new Car("Honda",1990,2500);

        for (int i = 0; i < cars.length; i++) {
            Assertions.assertNotEquals(0,cars[i].getYear());
        }

    }

    @Test
    void printWithInput() {
    }
}