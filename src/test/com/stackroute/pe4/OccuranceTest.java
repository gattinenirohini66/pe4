package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceTest {

    private Occurance occurance;

    @Before
    public void setUp() throws Exception {
       occurance = new Occurance();
    }

    @After
    public void tearDown() throws Exception {
        occurance = null;
    }

    @Test
    public void charOccurance() {
        assertEquals(2,occurance.charOccurance("Count the occUrance of charcater in string",'u'));
        assertEquals(3,occurance.charOccurance("CHECK FOR ALL UPPERCASES",'C'));
        assertEquals(1,occurance.charOccurance("123456 567899",' '));
    }
    @Test
    public void charOccuranceFailure() {
        assertNotEquals(0,occurance.charOccurance("Count the occUrance of charcater in string",'u'));
        assertNotEquals(7,occurance.charOccurance("CHECK FOR ALL UPPERCASES",'C'));
        assertNotEquals(2,occurance.charOccurance("123456 567899",' '));
        assertNotNull(occurance.charOccurance("123456789 abcdefghij",'4'));
    }

}