package com.stackroute;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {


    public List<String> sortStringAlphabetically(String str){

        str = str.trim();
        String strArr[] = str.split(" ");
        List<String> returnList = Arrays.asList(strArr);

        Collections.sort(returnList);
        return returnList;


    }
}
