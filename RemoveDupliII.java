package com.company;

public class RemoveDupliII {

    public static void main(String[] args) {
    int[] arr = {1,2,2,2,3,4,4};
        System.out.println(removeDuplicates2(arr));
    }

    static int removeDuplicates2 (int[] nums) {
        int count = 0;
        int i;
        int index = 1;
        int prev = nums[0];
       for (i = 1; i<= nums.length-1; i++){
           if (nums[i] == prev){
               count++;
               if (count <= 2){
                   nums[index] = nums[i];
                   index++;
               }
           }
            else {
                nums[index] = nums[i];
                index++;
                count = 1;
            }
        }
        return index;
    }
}

