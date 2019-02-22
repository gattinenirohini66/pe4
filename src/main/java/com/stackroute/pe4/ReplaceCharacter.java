package com.stackroute.pe4;

// To replace the given charcters with given string

public class ReplaceCharacter {
    public String replaceChar(String string,char firstCharacter,char secondCharacter){

        //If String is empty it will return null
        if(string.length()==0){
            return null;
        }
        else {
            string = string.toLowerCase();
            //converting the firstcharacter to string and then to lowercase
            String firstChar = Character.toString(firstCharacter);
            firstChar = firstChar.toLowerCase();

            //converting the secondcharacter to string and then to lowercase
            String secondChar = Character.toString(secondCharacter);
            secondChar = secondChar.toLowerCase();

            //replacing the old char with new char
            String result = string.replace(firstChar, "f");

            //replacing the result with anthor char
            result = result.replace(secondChar, "t");
            return result;
        }
    }
}
