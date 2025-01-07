package com.company;

public class dfs {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        dfs(root);
    }

    static void dfs(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.val+"");

        dfs(root.left);

        dfs(root.right);
    }
}