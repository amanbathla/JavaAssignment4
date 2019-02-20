package com.stackroute;

public class ReplaceAllCharacter {

    public String replaceCharacter(String str){

        String replacewithF = str.replaceAll("d","f");
        String returnString = replacewithF.replaceAll("l","t");
        return returnString;

    }
}
