
package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHarry {

    public Boolean isHarryHere(String str){

        String regex = "Harry|harry";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            return true;
        }
        else{
            return false;
        }
    }

}
