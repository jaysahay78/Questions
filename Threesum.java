package com.company;

import java.util.*;

public class Threesum {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 0, 2, 2};
        System.out.println(threeSum(arr));

    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ListofLists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ListofLists.add(list);
                    l++;
                    r--;
                    while (l<r && nums[l] == nums[l-1]){l++;}//skip duplicates
                    while (l<r && nums[r] == nums[r+1]){r--;}//skip duplicates
                }
            }
        }
        return ListofLists;
    }
}
