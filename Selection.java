package com.company;
import java.util.*;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 1, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr) {
        //find maximum element in array
        for (int i=0; i< arr.length; i++){
            int last = arr.length-i-1;
            int max = getMax(arr, 0, last);

            swap(arr, max, last);
        }
    }

    private static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i=start; i<= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
