package com.company;

public class maxSumTree {
    public static void main(String[] args) {
    }
    static int MaxSumPath(TreeNode root){
        int[] max = new int[1];
        maxPathDown(root, max);
        return max[0];
    }
    static int maxPathDown(TreeNode root, int[] max){
        if (root == null){
            return 0;
        }
        int left = Math.max(0, maxPathDown(root.left, max));
        int right = Math.max(0, maxPathDown(root.right, max));
        max[0] = Math.max(max[0], left+right+root.val);
        return Math.max(left, right) + root.val;
    }
}
