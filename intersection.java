package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        System.out.println(Arrays.toString(intersec(arr1, arr2)));
    }

    static int[] intersec(int[] nums1, int[] nums2){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for(int i : nums1){
                set1.add(i);
            }
            for(int j : nums2){
                if (set1.contains(j)){
                    set2.add(j);
                }
            }
            int[] result = new int[Math.max(set1.size(), set2.size())];
            int x = 0;
            for(int i : set2){
                result[x] = i;
                x++;
            }
            return result;
        }

    }
