package com.company;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1, 3, -4, 11, 212, 34, 44};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort (int[] arr) {
        boolean swapped;
        for (int i = 0; i<= arr.length; i++){
           swapped = false;
           for (int j=1; j< arr.length-i; j++){

               if (arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
               }
           }

            if (!swapped) {
                break;
            }
        }
    }
}