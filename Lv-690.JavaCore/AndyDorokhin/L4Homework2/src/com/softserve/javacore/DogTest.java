package com.softserve.javacore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private static Dog dog1;
    private static Dog dog2;
    private static Dog dog3;
    private static Dog dog4;

    @BeforeAll
    static void testInit() {
        System.out.println("BeforeAll section");
        dog1 = new Dog("Nike", DogBreed.GERMAN_SHEPHERD, 10);
        dog2 = new Dog("NIKE", DogBreed.GERMAN_SHEPHERD, 10);
        dog3 = new Dog("Lizzy", DogBreed.CHIHUAHUA, 3);
        dog4 = new Dog("Lizzy", DogBreed.LABRADOR, 3);
    }

    @Test
    void testGetNameTest() {
        assertEquals("Nike", dog1.getName());
    }

    @Test
    void testGetBreed() {
        assertEquals(DogBreed.GERMAN_SHEPHERD, dog1.getBreed());
    }

    @Test
    void testGetAge() {
        assertEquals(10, dog1.getAge());
    }

    @Test
    void testEquals() {
        assertAll(
                () -> assertTrue(dog1.equals(dog2)),
                () -> assertFalse(dog3.equals(dog4))
        );
    }

    @Test
    void testHashCode() {
        assertAll(
                () -> assertTrue(dog1.hashCode() == dog2.hashCode()),
                () -> assertTrue(dog1.equals(dog2))
        );


    }

}