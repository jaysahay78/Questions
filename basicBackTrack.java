package com.company;

public class basicBackTrack {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

    static int count(int r, int c){ //backtracking for a 3x3 matrix where the starting point is 1,1
        if (r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);

        return left+right;
    }
}
