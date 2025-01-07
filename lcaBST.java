package com.company;

public class lcaBST {
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

        System.out.println(lcaBst(root,root.left.left,root.left.right).val);
    }
    static TreeNode lcaBst(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return null;
        }
        if (root.val < p.val && root.val < q.val){
            return lcaBst(root.right, p, q);
        }
        if (root.val> p.val && root.val > q.val){
            return lcaBst(root.left, p, q);
        }
        return root;
    }
}
