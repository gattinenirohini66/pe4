package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    private TransposeString transpose;
    @Before
    public void setUp() throws Exception {
        transpose = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transpose = null;
    }
    @Test
    public void transpose() {
        assertEquals("a kciuq nworb",transpose.transpose("a quick brown"));
        assertEquals("321 654",transpose.transpose("123 456"));
        assertNull(transpose.transpose(""));
    }
    @Test
    public void transposeFailure() {
        assertNotEquals("a quick brown",transpose.transpose("a quick brown"));
        assertNotEquals("321 456",transpose.transpose("123 456"));
        assertNotNull(transpose.transpose("abc cde"));
    }
}