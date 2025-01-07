package com.company;

public class WaterContainer {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    static int maxArea(int[] height){
        int area = 0;
        int l =0;
        int r = height.length-1;
        while (l<r) {
            area = Math.max(area, Math.min(height[l], height[r]) * (r-l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return area;
    }
}
