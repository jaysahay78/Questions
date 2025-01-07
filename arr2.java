package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums =  {4, 2, 5, 9, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99; //this is known as mutability, changing the original value and not just the reference variable,
        // arrays in java are mutable whereas strings are immutable
    }
}
