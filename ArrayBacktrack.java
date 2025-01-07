package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayBacktrack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

        static void backtrack (List<List<Integer>> resultList, List<Integer> tempList,int[] nums){
            if (tempList.size() == nums.length) {
                resultList.add(new ArrayList<>(tempList));
                return;
            }
            for (int number : nums) {

                if (tempList.contains(number)) {
                    continue;
                }
                //add the number
                tempList.add(number);

                //go back to the array to try another element
                backtrack(resultList, tempList, nums);

                //remove the number just added
                tempList.remove(tempList.size() - 1);
            }
    }
}