package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchersTest {

    private Matchers matchers;
    @Before
    public void setUp() throws Exception {
        matchers = new Matchers();
    }

    @After
    public void tearDown() throws Exception {
        matchers = null;
    }

    @Test
    public void matchers() {
        assertEquals("Found at:4-6",matchers.matchers("She sell","se"));
        assertEquals("Found at:0-3 Found at:4-7 Found at:8-11 Found at:16-19",matchers.matchers("cat cat cat tie cat","cat"));
        assertNull(matchers.matchers("","se"));
    }

    @Test
    public void matchersFailure() {
        assertNotEquals("Found at:4-6 found at:7-8",matchers.matchers("She sell","se"));
        assertNotEquals("Found at:0-3 Found at:4-7 Found at:8-11",matchers.matchers("cat cat cat tie cat","cat"));
        assertNotNull(matchers.matchers("cat cat cat","se"));
    }
}