package com.company;

import java.util.ArrayList;

public class subsetArrList {
    public static void main(String[] args) {
        System.out.println(subseq("","abc"));
    }
        static ArrayList<String> subseq (String pr, String upr){
         if (upr.isEmpty()){
             ArrayList<String> list = new ArrayList<>();
             list.add(pr);
             return list;
         }
         char ch = upr.charAt(0);
         ArrayList<String> left = subseq(pr+ch, upr.substring(1));
         ArrayList<String> right = subseq(pr, upr.substring(1));
         left.addAll(right);
         return left;
    }
}