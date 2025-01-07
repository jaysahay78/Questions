package com.company;

import java.util.*;

public class rightview {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        node.display();
        System.out.println(rightView(node));
    }
    static List<Integer> rightView(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        recursionRight(root, 0, ans);
        return ans;
    }

    static void recursionRight(TreeNode root, int level, List<Integer> ans){
        if (root == null){
        return;
        }
        if (level == ans.size()){
            ans.add(root.val);
        }
        recursionRight(root.right, level+1, ans);
        recursionRight(root.left, level+1, ans);
    }
}
