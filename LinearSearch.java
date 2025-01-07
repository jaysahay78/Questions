package com.company;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("enter array: ");
        for (int i = 0; i<arr.length; i++){
        arr[i] = in.nextInt();}
        System.out.println("enter target element: ");
        int target = in.nextInt();
        System.out.println(LinearSearch(arr, target));

    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}