package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class SortListTest {


    SortList sortList;

    @Before
    public void setUp() throws Exception {
        sortList = new SortList();
    }

    @After
    public void tearDown() throws Exception {
        sortList = null;
    }

    @Test
    public void sortStringAlphabetically() {
        String input = "you know you're in love when you can't fall asleep because reality is finally better than your dreams";
        String input1 = "you know you're in love when you can't fall asleep";
        List<String> output = new ArrayList<>();
        output.add("asleep");
        output.add("because");
        output.add("better");
        output.add("can't");
        output.add("dreams");output.add("fall");output.add("finally");
        output.add("in");output.add("is");output.add("know");
        output.add("love");output.add("reality");output.add("than");
        output.add("when");output.add("you");output.add("you");output.add("you're");
        output.add("your");
        assertEquals(output,sortList.sortStringAlphabetically(input));
        assertNotEquals(output,sortList.sortStringAlphabetically(input1));

    }
}