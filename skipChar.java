package com.company;
import java.lang.*;

public class skipChar {
    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println(skip(input));
    }
    static String skip (String upr){
        if (upr.isEmpty()){
            return "";
        }
        char ch = upr.charAt(0);
        if (ch == 'o'){
           return skip(upr.substring(1));
        }
        else {
            return ch + skip(upr.substring(1));
        }
    }
}
