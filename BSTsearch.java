package com.company;

public class BSTsearch {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.left.left = new TreeNode(5);
        root.right.left.right = new TreeNode(7);

        System.out.println(bstSearch(root, 6));

    }
    static TreeNode bstSearch(TreeNode root, int val){
        while(root != null && root.val != val){
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}
