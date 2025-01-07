package com.company;
import java.util.*;
import java.lang.*;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int num : nums){
            int n = ans.size();
            for (int i = 0; i< n; i++){
                List<Integer> list = new ArrayList<>(ans.get(i));
                list.add(num);
                ans.add(list);
            }
        }
        return ans;
    }
}
