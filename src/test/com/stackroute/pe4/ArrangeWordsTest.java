package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrangeWordsTest {

    private ArrangeWords arrangeWords;
    @Before
    public void setUp() throws Exception {
        arrangeWords = new ArrangeWords();
    }

    @After
    public void tearDown() throws Exception {
        arrangeWords = null;
    }

    @Test
    public void displayWords() {
        assertEquals(new String[]{"extract","given","of","string","the","words"},arrangeWords.displayWords("Extract the Words of given string"));
        assertEquals(new String[]{"fsd","in","learn","stackroute"},arrangeWords.displayWords("LEARN FSD IN STACKROUTE"));
        assertNull(arrangeWords.displayWords(""));
    }
    @Test
    public void displayWordsFailure() {
        assertNotEquals(new String[]{"extract","given","of","string","words"},arrangeWords.displayWords("Extract the Words of given string"));
        assertNotEquals(new String[]{"fsd","IN","learn","stackroute"},arrangeWords.displayWords("LEARN FSD IN STACKROUTE"));
        assertNotNull(arrangeWords.displayWords("abc gyt adc hii"));
    }
}