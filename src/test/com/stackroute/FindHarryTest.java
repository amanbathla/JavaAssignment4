package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {

    FindHarry findHarry;

    @Before
    public void setUp() throws Exception {
        findHarry = new FindHarry();
    }

    @After
    public void tearDown() throws Exception {
        findHarry = null;
    }

    @Test
    public void isHarryHere() {
        assertTrue(findHarry.isHarryHere("HarryB is here"));
        assertTrue(findHarry.isHarryHere("harryB is here"));
        assertFalse(findHarry.isHarryHere("No such persons"));
        assertNotNull(findHarry);
    }
}