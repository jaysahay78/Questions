package com.company;
import java.lang.*;

public class orderAgBinarySearch {
    public static void main(String[] args) {
        int[] arr = {62, 53, 47, 36, 24, 16, 4, 3, 2};
        int target = 47;
        int ans;
        if (arr[0] < arr[arr.length-1]){
        ans = BinarySearch1(arr, target);}
        else {ans = BinarySearch2(arr, target);}
        System.out.println(ans);
    }
    //return index if the target element is found
    //return -1 if the target element is not found
    static int BinarySearch1(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find the middle element
            int mid = start + (end - start) / 2; //as start + end might exceed the range of integers
            if (target < arr[mid]){
                //lhs of array hence start will not change but end will change
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int BinarySearch2(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find the middle element
            int mid = start + (end - start) / 2; //as start + end might exceed the range of integers
            if (target > arr[mid]){
                //lhs hence start will not change but end will change
                end = mid-1;
            }
            else if (target < arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
