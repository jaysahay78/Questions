package com.company;

import java.util.ArrayList;

public class MazeHVD {
    public static void main(String[] args) {
        System.out.println(paths("", 3,3));
    }
    static ArrayList<String> paths(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r>1 && c>1){
            list.addAll(paths(p+'D', r-1, c-1));
        }
        if (r>1){
            list.addAll(paths(p + 'V', r-1, c));
        }
        if (c>1){
            list.addAll(paths(p + 'H', r, c-1));
        }
        return list;
    }
}
