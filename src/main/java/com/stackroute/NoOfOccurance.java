package com.stackroute;

public class NoOfOccurance {

    public int noOfOccuranceOfCharacter(String str,String character){

        str = str.toLowerCase();
        character = character.toLowerCase();

      int charCount = str.length() - str.replace(character,"").length();
        return charCount;
    }
}
