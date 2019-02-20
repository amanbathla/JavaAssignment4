package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoOfOccuranceTest {

    NoOfOccurance noOfOccurance;

    //before set up
    @Before
    public void setUp() throws Exception {
        noOfOccurance = new NoOfOccurance();
    }

    @After
    public void tearDown() throws Exception {
        noOfOccurance = null;
    }

    // No of Occurance of Character

    @Test
    public void noOfOccuranceOfCharacter() {
        assertEquals(2,noOfOccurance.noOfOccuranceOfCharacter("aman","a"));
        assertEquals(5,noOfOccurance.noOfOccuranceOfCharacter("This is Niit stackroute I","I"));
        assertNotEquals(4,noOfOccurance.noOfOccuranceOfCharacter("This is NIIIt Stackroute","i"));
        assertNotNull(noOfOccurance);
    }
}