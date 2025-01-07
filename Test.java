package com.company;

import java.util.*;

public class Test {
    static int[] findPeakGrid(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int start = 0;
        int end = n-1;
        for (int i = 0; i<m; i++){
            while(start < end){
                int mid = start +(end-start)/2;
                if (mat[i][mid] > mat[i][mid+1]){
                    end = mid;
                }
                else start = mid+1;
            }
            if (check(mat, i, start) == 1){
                return new int[]{i,start};
            }
        }
        return new int[]{-1,-1};
    }

    static int check(int[][] mat, int i, int j){
        if (i >= 0 && i < mat.length) {
            // Top row case
            if (i == 0) {
                if (mat[i][j] > mat[i+1][j]) {
                    return 1;
                }
            }
            // Bottom row case
            else if (i == mat.length - 1) {
                if (mat[i][j] > mat[i-1][j]) {
                    return 1;
                }
            }
            // Middle rows case
            else {
                if (mat[i][j] > mat[i+1][j] && mat[i][j] > mat[i-1][j]) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {{25, 37, 23, 37, 19}, {45, 19, 2, 43, 26}, {18, 1, 37, 44, 50}};
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }
}

