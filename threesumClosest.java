package com.company;

import java.util.*;

public class threesumClosest {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0};
        System.out.println(closest3Sum(arr,100));
    }

    static int closest3Sum(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                    if (Math.abs(target - sum) < Math.abs(target-closestSum)) {
                        closestSum = sum;
                    }
                    if (sum < target){l++;}
                    else if (sum > target) {r--;}
                    else return sum;
            }
        }
        return closestSum;
    }
}