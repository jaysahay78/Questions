package com.company;

import java.util.Arrays;

class CycSort {
    public static void main(String[] args) {
        int[] arr = {11, 1, 9, 4, 7, 5, 3, 6, 8, 2, 10};
        CycSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void CycSort (int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }


    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
}