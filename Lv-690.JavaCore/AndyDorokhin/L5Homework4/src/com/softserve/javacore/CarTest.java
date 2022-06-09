package com.softserve.javacore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private static Car testCar1;
    private static Car testCar2;
    private static Car testCar3;

    @BeforeAll
    static void testInit() {
        System.out.println("BeforeAll section");

        testCar1 = new Car(CarType.SEDAN, 2020, 2200);
        testCar2 = new Car(CarType.HATCHBACK, 2020, 1600);
        testCar3 = new Car(CarType.SUV, 2015, 3000);

        System.out.println("Test cars created");
        System.out.println(testCar1);
        System.out.println(testCar2);
        System.out.println(testCar3);
    }

    @Test
    void getTypeTest() {
        assertEquals(CarType.SEDAN, testCar1.getType());
    }

    @Test
    void getProductionYearTest() {
        assertEquals(2015, testCar3.getProductionYear());
    }

    @Test
    void getEngineCapacityTest() {
        assertEquals(1600, testCar2.getEngineCapacity());
    }

    @Test
    void compareToTest() {
        assertAll(
                () -> assertEquals(0,testCar1.compareTo(testCar2)),
                () -> assertTrue(testCar1.compareTo(testCar3) > 0)
        );
    }
}