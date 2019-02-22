package com.stackroute.pe4;
import java.util.*;

// To arrange the given string in alphabatical order
public class ArrangeWords {
    public String[] displayWords(String string){

        //If String is empty it will return null
        if(string.length()==0){
            return null;
        }
        else {
            string = string.toLowerCase();
            String[] result = string.split(" ");
            //sorting the array result
            Arrays.sort(result);
            return result;
        }
    }
}
