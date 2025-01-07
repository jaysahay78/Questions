package com.company;

public class validBst {
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

        System.out.println(isBst(root));
    }
    static boolean isBst(TreeNode root){
        return isBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean isBst(TreeNode root, long minVal, long maxVal) {
        if (root == null){return true;}
        if (root.val >= maxVal || root.val <= minVal){
            return false;
        }
        return isBst(root.left, minVal, root.val) && isBst(root.right, root.val, maxVal);
    }

}
