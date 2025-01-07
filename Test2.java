package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> list = new ArrayList<>();
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0] <= intervals[i-1][1]){
                if (intervals[i][1] < intervals[i-1][1]){
                    list.add(Arrays.asList(intervals[i-1][0], intervals[i-1][1]));
                }
                else{
                    list.add(Arrays.asList(intervals[i-1][0], intervals[i][1]));
                }
            }
            else list.add(Arrays.asList(intervals[i-1][0], intervals[i-1][1]));
        }
        int[][] result = new int[list.size()][2];
        for (int i=0;i<list.size();i++){
            result[i][0] = list.get(i).get(0);
            result[i][1] = list.get(i).get(1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,4},
                {3,6},
                {2,5},
                {8,10}
        };
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
