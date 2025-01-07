package com.company;

public class symmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);

        System.out.println(isSymmetric(root));
    }

    static boolean isSymmetric(TreeNode root) {
        return root == null || symmetricHelp(root.left, root.right);
    }

    static boolean symmetricHelp(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if (left.val != right.val){
            return false;
        }
        return symmetricHelp(left.left, right.right) && symmetricHelp(left.right, right.left);
    }
}
