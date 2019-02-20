package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose transpose;
    @Before
    public void setUp() throws Exception {
        transpose = new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        transpose = null;
    }

    @Test
    public void transposeString() {
        assertEquals(null,transpose.transposeString(""));
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",transpose.transposeString("a quick brown fox jumps over the lazy dog"));
        assertEquals("nama",transpose.transposeString("aman"));
        assertNotNull(transpose);
        assertNotEquals("aknkwnc",transpose.transposeString("hjwbvhjw"));
    }
}