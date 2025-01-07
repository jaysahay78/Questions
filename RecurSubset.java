package com.company;

public class RecurSubset {
    public static void main(String[] args) {
        subreq("", "abc");
    }
    static void subreq(String pr, String upr){
        if (upr.isEmpty()){
            System.out.println(pr);
            return;
        }
        char ch = upr.charAt(0);
        subreq(pr + ch, upr.substring(1));
        subreq(pr, upr.substring(1));
    }
}
