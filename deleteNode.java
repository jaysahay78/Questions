package com.company;

public class deleteNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        root.right.right = new TreeNode(12);
        root.right.right.left = new TreeNode(10);
        root.right.right.right = new TreeNode(13);
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if (root == null){return null;}
        if (root.val == key){return helper(root);}
        TreeNode dummy  = root;

        while(root != null){
            if (root.val > key){
                if (root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                    break;
                }
                else {root = root.left;}
            }
            else {
                if (root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                }
                else {root = root.right;}
            }
        }
        return dummy;
    }

    static TreeNode helper(TreeNode root){
        if (root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        TreeNode rightChild = root.right;
        TreeNode RightLast = findLastRight(root.left);
        RightLast.right = rightChild;
        return root.left;
    }
    static TreeNode findLastRight(TreeNode root){
        if (root.right == null){
            return root;
        }
        return findLastRight(root.right);
    }
}