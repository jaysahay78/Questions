package com.company;

import java.util.*;

public class AsciiSubset {
    public static void main(String[] args) {
        System.out.println(subseq("", "abc"));
    }
    static ArrayList<String> subseq (String pr, String upr){
        if (upr.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        char ch = upr.charAt(0);
        ArrayList<String> first = subseq(pr+ch, upr.substring(1));
        ArrayList<String> second = subseq(pr, upr.substring(1));
        ArrayList<String> third = subseq(pr + (ch+0), upr.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
