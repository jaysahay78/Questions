package com.company;

import java.util.ArrayList;

public class boundTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
    }
    static ArrayList<Integer> boundaryTraversal(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        helperLeft(root, ans);
        addLeaves(root, ans);
        helperRight(root, ans);
        return ans;
    }
    static void helperLeft(TreeNode root, ArrayList<Integer> list){
        TreeNode current = root.left;
        while (current != null) {
            if (current.left != null && current.right != null) {
                list.add(current.val);
            }
            if (current.left != null){
                current = current.left;
            }
            else {current = current.right;}
        }
    }
    static void addLeaves(TreeNode root, ArrayList<Integer> list){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            list.add(root.val);
        }
        if (root.left != null){addLeaves(root.left, list);}
        if (root.right != null){addLeaves(root.right, list);}
    }

    static void helperRight(TreeNode root, ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        TreeNode current = root.right;
        while (current != null) {
            if (current.left != null && current.right != null) {
                temp.add(current.val);
            }
            if (current.right != null){
                current = current.right;
            }
            else {current = current.left;}
            for (int i = temp.size()-1; i>=0; i--){
                list.add(temp.get(i));
            }
        }
    }
}
