package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
    int[] arr = {2,2,2,2,2};
        System.out.println(fourSum(arr, 8));
    }
    static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> ListofLists = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue;
            }
                for (int i = j + 1; i < nums.length; i++) {
                    if (i > j+1 && nums[i] == nums[i - 1]) {
                        continue;
                    }
                    int l = i + 1;
                    int r = nums.length - 1;
                    while (l < r) {
                        long sum = (long)nums[j]+(long)nums[i]+(long)nums[l]+(long)nums[r];
                        if((long)nums[j]+(long)nums[i]+(long)nums[l]+(long)nums[r]>Integer.MAX_VALUE)
                        {return ListofLists;}
                        if (sum < target) {
                            l++;
                        } else if (sum > target) {
                            r--;
                        } else {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[j]);
                            list.add(nums[i]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            ListofLists.add(list);
                            l++;
                            r--;
                            while (l < r && nums[l] == nums[l - 1]) {
                                l++;
                            }//skip duplicates
                            while (l < r && nums[r] == nums[r + 1]) {
                                r--;
                            }//skip duplicates
                        }
                    }
                }
            }
        return ListofLists;
    }
}
