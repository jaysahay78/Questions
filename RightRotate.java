package com.company;
import java.util.*;
import java.lang.*;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {-1, -100, 3, 99};
        System.out.println(Arrays.toString(rotate(arr, 2)));
    }

    static int[] rotate (int[] arr, int k){
        k%=arr.length;
        int[] temp = new int[k];
        for (int i=0; i<k; i++){
            temp[i] = arr[arr.length-k+i]; //storing the last k elements to be shifted in a temp arr
        }
        for (int i = arr.length-1; i>=k; i--) {
            arr[i] = arr[i-k];
        }//shifting elements by k positions
        for (int i=0; i<k; i++){
            arr[i] = temp[i];
        }//replacing the last elements with elements from temp arr
        return arr;
    }
}