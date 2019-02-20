package com.stackroute;

public class Transpose {

    public String transposeString(String str){
        String returnString = "";
        String strArr[] = str.split(" ");

        if(str == null || str.trim().isEmpty()){
            return  null;
        }

        for(int i = 0;i<strArr.length;i++){

            String word = strArr[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWord = reverseWord + word.charAt(j);
            }
            returnString = returnString + " "  + reverseWord;

        }

        return returnString.trim();
    }
}
