package com.company;

public class bstCeiling {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(10);

        System.out.println(BSTceil(root, 9));
    }
    static int BSTceil(TreeNode root, int key){
        int ceil = -1;
        while(root != null) {
            if (root.val == key) {
                return root.val;
            }
            else if (key > root.val) {
                root = root.right;
            }
            else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
}
