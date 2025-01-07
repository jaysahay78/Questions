package com.company;

public class backspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backSpace("ab#c", "ad#c"));
    }

    static boolean backSpace(String s, String t) {
        int hashCount1 = 0;
        int hashCount2 = 0;
        StringBuilder newstr1 = new StringBuilder();
        StringBuilder newstr2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                hashCount1++;
                continue;
            }
            if (hashCount1 > 0) {
                hashCount1--;
            } else newstr1.insert(0, s.charAt(i));
        }
            for (int i = t.length() - 1; i >= 0; i--) {
                if (t.charAt(i) == '#') {
                    hashCount2++;
                    continue;
                }
                if (hashCount2 > 0){
                    hashCount2--;
                }
                else newstr2.insert(0, t.charAt(i));
        }
        System.out.println(newstr1);
        System.out.println(newstr2);
        return newstr1.toString().equals(newstr2.toString());
    }
}
