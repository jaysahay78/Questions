package com.company;
import java.util.*;

public class LetterCombo {
    public static void main(String[] args) {
        System.out.println(letterCombo("419"));
    }

    static List<String> letterCombo(String digits){
        List<String> ans = new ArrayList<>(helper("", digits));
        return ans;
    }
    static List<String> helper(String pr, String upr){
        if (upr.isEmpty()){
        List<String> ans = new ArrayList<>();
        ans.add(pr);
        return ans;
    }

        int digit = upr.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
        char ch = (char)('a' + i );
        list.addAll(helper(pr + ch, upr.substring(1)));
        }
        return list;
    }
}
