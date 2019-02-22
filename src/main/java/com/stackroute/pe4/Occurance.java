package com.stackroute.pe4;

// To find the occurance of the given character in the string

public class Occurance {
    public int charOccurance(String string,char ch){

        //If String is empty it will return null
        if(string.length()==0){
            return 0;
        }
        else {
            string = string.toLowerCase();
            //converting the char to string and then to lowercase
            String character = Character.toString(ch);
            character = character.toLowerCase();

            //counting the length of entire string and length of string without that char
            int length = string.length();
            int subLength = string.replace(character, "").length();

            //difference between them results count of that occurance of char
            int count = length - subLength;
            return count;
        }
    }
}
