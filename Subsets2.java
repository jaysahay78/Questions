package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int[] n = {1,2,4,5};
        System.out.println(sub(n));
    }

    static List<List<Integer>> sub(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int num : nums) {
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList<>(ans.get(i));
                list.add(num);
                ans.add(list);
            }
        }
        System.out.println(ans.size());
        return ans;
    }
}
