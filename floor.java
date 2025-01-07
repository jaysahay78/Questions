package com.company;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2, 4, 12, 34, 46, 67, 73, 90};
        int target = 47;
        int ans = Binsearch(arr, target);
        System.out.println(ans);
    }
    static int Binsearch(int[] arr, int target){
        int  start = 0;
        int end = arr.length -1;


    while (start <= end){
        int mid = (start + (end-start));

        if (target < arr[mid]){
            end = mid-1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        }
        else {
            return mid;
        }
    }
        return end;
    }
 }