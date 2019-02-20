package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllCharacterTest {


    ReplaceAllCharacter replaceAllCharacter;

    @Before
    public void setUp() throws Exception {
        replaceAllCharacter = new ReplaceAllCharacter();
    }

    @After
    public void tearDown() throws Exception {
        replaceAllCharacter = null;
    }

    @Test
    public void replaceCharacter() {
        assertEquals("faity fry",replaceAllCharacter.replaceCharacter("daily dry"));
       assertEquals("Virat Kohti",replaceAllCharacter.replaceCharacter("Virat Kohli"));
        assertNotNull(replaceAllCharacter.replaceCharacter(""));
    }
}