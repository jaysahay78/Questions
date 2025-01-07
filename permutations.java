package com.company;
import java.util.*;

public class permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }
    static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int number : nums) {
                if (tempList.contains(number)) {
                    continue;// element already exists in the List, skip
                }
                //add the number
                tempList.add(number);

                //go back to the array to try another element
                backtrack(result, tempList, nums);

                //remove the number just added
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
