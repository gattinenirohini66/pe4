package com.stackroute.pe4;
import java.util.regex.*;

// To check wheather the given substring present in string
public class PresenceName {
    public boolean namePresence(String string,String subString){
        string=string.toLowerCase();
        Pattern r = Pattern.compile(subString);
        Matcher m = r.matcher(string);
        if(m.find()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
