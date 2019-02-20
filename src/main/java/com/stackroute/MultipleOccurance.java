package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public static void main(String args[]){
        MultipleOccurance multipleOccurance = new MultipleOccurance();
        multipleOccurance.multipleOccurance("She sells seashells by the seashore","SE");

    }

    //Multiple Occurance of a String

    public void multipleOccurance(String str,String word){

        String regex = word;

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
        {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
    }

}
