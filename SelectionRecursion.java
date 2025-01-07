package com.company;

import java.util.Arrays;

public class SelectionRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 6, 5};
        RecurSort(arr, 5, 0, 0);
        System.out.println(Arrays.toString(arr));


    }

    static void RecurSort(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[max]){
                RecurSort(arr, r, c+1, c);
            }
            else {RecurSort(arr, r, c+1, max);}
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            RecurSort(arr, r-1, 0, 0);
        }
    }
}
