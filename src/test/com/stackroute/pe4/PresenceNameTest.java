package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceNameTest {

    private PresenceName presencename;
    @Before
    public void setUp() throws Exception {
        presencename = new PresenceName();
    }

    @After
    public void tearDown() throws Exception {
        presencename = null;
    }

    @Test
    public void namePresence() {
        assertEquals(true,presencename.namePresence("This is Harry","harry"));
        assertEquals(false,presencename.namePresence("This is Henry","harry"));
    }
    @Test
    public void namePresenceFailure() {
        assertNotEquals(true, presencename.namePresence("This is Henry","Harry"));
        assertNotNull(presencename.namePresence("This is Henry","Harry"));
    }
}