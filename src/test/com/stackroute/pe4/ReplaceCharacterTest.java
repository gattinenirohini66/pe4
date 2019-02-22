package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    private ReplaceCharacter replacechar;

    @Before
    public void setUp() throws Exception {
        replacechar = new ReplaceCharacter();
    }

    @After
    public void tearDown() throws Exception {
        replacechar = null;
    }

    @Test
    public void replaceChar() {
        assertEquals("faity fry",replacechar.replaceChar("daily dry",'d','l'));
        assertEquals("stack",replacechar.replaceChar("SLACK",'d','l'));
        assertNull(replacechar.replaceChar("",'d','l'));
    }
    @Test
    public void replaceCharFailure() {
        assertNotEquals("fairy dry",replacechar.replaceChar("daily dry",'d','l'));
        assertNotEquals("STACK",replacechar.replaceChar("SLACK",'d','l'));
        assertNotNull(replacechar.replaceChar("daily dry",'d','l'));
    }
}