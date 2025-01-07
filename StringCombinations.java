package com.company;

import java.util.ArrayList;

public class StringCombinations {
    public static void main(String[] args) {
       ArrayList<String> ans = permutations("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> permutations (String pr, String upr){
        if (upr.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = upr.charAt(0);
        for (int i=0; i<=pr.length(); i++){
            String f = pr.substring(0,i);
            String s = pr.substring(i, pr.length());
            ans.addAll(permutations(f+ch+s, upr.substring(1)));
        }
        return ans;
    }
}
