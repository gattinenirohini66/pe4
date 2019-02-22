package com.stackroute.pe4;
import java.lang.*;
import java.util.*;
public class TransposeString {
    public String transpose(String string){

        String result="";
        //If String is empty it will return null
        if(string.length()==0){
            return null;
        }
        else {
            string = string.toLowerCase();
            String[] temp = string.split(" ");
            for(int i=0;i<temp.length;i++)
            {
                StringBuffer sb = new StringBuffer(temp[i]);
                result+=sb.reverse()+" ";
            }
            // Removing the space at end of the string
            result=result.trim();
            return result;
        }
    }
}
