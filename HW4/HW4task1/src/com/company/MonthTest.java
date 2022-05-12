package com.company;

import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class MonthTest {
    private Month month;
    @Before
    public void setUp(){
        month = new Month();
    }
    @org.junit.Test
    public void printNumberOfMonth() {
        int result = month.printNumberOfMonth(1);
        Assert.assertEquals(31 , result);
    }
}