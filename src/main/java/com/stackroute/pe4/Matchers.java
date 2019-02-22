package com.stackroute.pe4;
import java.util.regex.*;

// To find the substring positions
public class Matchers {
    public String matchers(String string,String subString) {
        String result= "";

        //If String is empty it will return null
        if (string.length() == 0) {
            return null;
        }
        else {
            string = string.toLowerCase();
            Pattern pattern = Pattern.compile(subString);
            Matcher m = pattern.matcher(string);
            while (m.find()) {
                result+="Found at:" + m.start() + "-" + m.end()+" ";
            }
            return result.trim();
        }
    }
}
