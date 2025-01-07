package com.company;

import java.util.ArrayList;
import java.util.List;

public class permutations2 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permuations2(nums));
    }
    static List<List<Integer>> permuations2(int[] nums){
        if (nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, nums, 0);
        return ans;
    }

    static void backtrack(List<List<Integer>> result,  int[] nums, int index){
        if (index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int number: nums){
                list.add(number);
            }
            result.add(list);
            return;
        }
        for (int i = index; i< nums.length; i++) {
            if (i != index && !canPermute(nums, index, i)){
                continue;
            }
            swap(nums, index , i);
            backtrack(result, nums, index+1);
            swap(nums, index, i);
        }
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static boolean canPermute(int[] nums, int l, int h){
        for (int i = l; l<h; l++){
            if (nums[i] == nums[h]){
                return false;
            }
        }
        return true;
    }
}
