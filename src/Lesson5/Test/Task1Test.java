package Lesson5.Test;

import Lesson5.Task1;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class Task1Test {
    @Test
    public void testNumberOfDays(){
        Task1 task1 =new Task1();
        assertEquals(31, task1.numberOfDays(1));
        assertEquals(28, task1.numberOfDays(2));
        assertEquals(31, task1.numberOfDays(3));
        assertEquals(30, task1.numberOfDays(4));
        assertEquals(31, task1.numberOfDays(5));
        assertEquals(30, task1.numberOfDays(6));
        assertEquals(31, task1.numberOfDays(7));
        assertEquals(31, task1.numberOfDays(8));
        assertEquals(30, task1.numberOfDays(9));
        assertEquals(31, task1.numberOfDays(10));
        assertEquals(30, task1.numberOfDays(11));
        assertEquals(31, task1.numberOfDays(12));

    }
}
