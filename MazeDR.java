package com.company;

import java.util.ArrayList;

public class MazeDR {
    public static void main(String[] args) {
        String p = new String();
        System.out.println(Maze(3,3));
        System.out.println(paths(p, 3, 3));

    }
    static int Maze(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int left = Maze(r-1, c);
        int right = Maze(r, c-1);
        return left + right;
    }
    static ArrayList<String> paths(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(paths(p+'D', r-1, c));
        }
        if (c>1){
            list.addAll(paths(p+'R', r, c-1));
        }
        return list;
    }
}
