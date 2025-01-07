package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4},
                {3,6},
                {2,5},
                {8,10}
        };
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        for(int[] nums : arr){
            list.add(Arrays.asList(nums[0], nums[1]));
        }
        System.out.println(list);
    }
}
