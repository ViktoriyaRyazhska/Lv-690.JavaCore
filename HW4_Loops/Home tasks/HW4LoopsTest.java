package JavaCore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class HW4LoopsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkMonths() {

        int[] months = {31,0,31,30,31,30,31,31,30,31,30,31};

        for (int i=0;i<months.length;i++){
            Assertions.assertNotEquals(0,months[i]," wrong month " + (i+1));
            }
    }

    @ParameterizedTest
    @ValueSource(ints = -1)
    void doSomething10int(int x) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0;i<arr.length;i++){
            Assertions.assertNotEquals(x,arr[i]," wrong number " + arr[i]);
        }

    }

    @Test
    void doSomething5int() {



    }

    @Test
    void printWithInput() throws IOException {


    }
}