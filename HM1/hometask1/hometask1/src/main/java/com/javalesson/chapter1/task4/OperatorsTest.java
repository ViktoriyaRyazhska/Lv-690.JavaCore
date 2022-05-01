package com.javalesson.chapter1.task4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorsTest {

    @Test
    public void testStrangenes0() {
        //3
        assertEquals("3 Should be Strange", "Strange", OperatorsAndStatementsTask.checkStrangeness(3));
    }

    @Test
    public void testStrangenes1() {
        //24
        assertEquals("24 Should be Normal", "Normal", OperatorsAndStatementsTask.checkStrangeness(24));
    }


    @Test
    public void testStrangenes2() {
        //15
        assertEquals("15 Should be Strange", "Strange", OperatorsAndStatementsTask.checkStrangeness(15));
    }

    @Test
    public void testStrangenes3() {
        //29
        assertEquals("29 Should be Strange", "Strange", OperatorsAndStatementsTask.checkStrangeness(29));
    }

    @Test
    public void testStrangenes4() {
        //5
        assertEquals("5 Should be Strange", "Strange", OperatorsAndStatementsTask.checkStrangeness(5));
    }

    @Test
    public void testStrangenes5() {
        //100
        assertEquals("100 Should be Normal", "Normal", OperatorsAndStatementsTask.checkStrangeness(100));
    }

    @BeforeClass
    public static void callMain() {
        OperatorsAndStatementsTask.main(new String[0]);
    }

    @Test
    public void testStrangeNum() {
        assertEquals("Expected 3 Strange numbers", 3, OperatorsAndStatementsTask.getStrange());
    }

    @Test
    public void testNormalNum() {
        assertEquals("Expected 3 Normal numbers", 3, OperatorsAndStatementsTask.getNormal());
    }
}
