package com.company;

import java.util.Arrays;

public class spiral {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int count = 0;
        int total = n*n;

        int startingrow = 0;
        int startingcol = 0;
        int endingrow = n-1;
        int endingcol = n-1;
        while (count < total) {

            for (int i = startingcol; count < total && i <= endingcol; i++) {
                matrix[startingrow][i] = i;
                count++;
            }
            startingrow++;

            for (int i = startingrow; count < total && i<= endingrow; i++ ) {
                matrix[i][endingcol] = i;
                count++;
            }
            endingcol--;

            for (int i = endingcol; count < total && i>= startingcol; i--){
                matrix[endingrow][i] = i;
                count++;
            }
            endingrow--;
            for (int i = endingrow; count < total && i>= startingrow; i--){
                matrix[i][startingcol] = i;
                count++;
            }
            startingcol++;

        }

        for (int[] i: matrix) {
            System.out.println(Arrays.toString(i));

        }

        }
    }
