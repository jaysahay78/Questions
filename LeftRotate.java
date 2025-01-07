package com.company;
import java.util.*;
import java.lang.*;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr, 2)));
    }

    static int[] rotate (int[] arr, int k){
        k = k%arr.length;
        int c = 0;
        int[] temp = new int[arr.length];
            for (int i=0; i<k; i++){
                temp[i] = arr[i];
            }
            for (int i = k; i<arr.length; i++) {
                arr[i - k] = arr[i];
            }
            while(k+1+c < arr.length){
                arr[k+1+c] = temp[c];
                c++;
            }
        return arr;
    }
}