package com.company;

import java.util.Arrays;

public class findKthBst {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        System.out.println(Arrays.toString(kth(root, 3)));
    }
    static void reverseInorder(TreeNode root, int[] counter, int k, int[] kLargest) {
        if (root == null || counter[0]>=k){return;}
        reverseInorder(root.right, counter, k, kLargest);
        counter[0]++;
        if (counter[0] == k){
            kLargest[0] = root.val;
            return;
        }
        reverseInorder(root.left, counter,k, kLargest);
    }

    static void Inorder(TreeNode root, int[] counter, int k, int[] kSmallest){
        if (root == null || counter[0]>= k){return;}
        Inorder(root.left, counter, k, kSmallest);
        counter[0]++;
        if (counter[0] == k){
            kSmallest[0] = root.val;
        }
        Inorder(root.right, counter, k, kSmallest);
    }
    static int[] kth(TreeNode root, int k){
        int[] kSmallest = new int[]{Integer.MIN_VALUE};
        int[] kLargest = new int[]{Integer.MIN_VALUE};
        int[] counter = new int[]{0};
        Inorder(root, counter, k, kSmallest);

        counter[0] = 0;

        reverseInorder(root, counter, k, kLargest);
        return new int[]{kSmallest[0],kLargest[0]};
    }
}
