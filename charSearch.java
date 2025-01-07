package com.company;

import java.util.*;
import java.lang.*;

public class charSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "JaySahay";
        char target = in.next().charAt(0);
        System.out.println(search(name, target));
    }

        static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i< str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
