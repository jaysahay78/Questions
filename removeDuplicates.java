package com.company;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates (int[] nums){
        int count = 0;
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            if (nums[l] == nums[l+1]){
                nums[r] = nums[l];
                l++;
                r--;
                count++;
            }
            else {
                l++;
                r--;
                count++;
            }
        }
        return count;
    }
}
