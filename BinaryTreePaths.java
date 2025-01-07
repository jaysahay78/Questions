package com.company;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(4);
        tree.left.right = new TreeNode(6);
        tree.left.left = new TreeNode(5);
        System.out.println(binaryTreePaths(tree));
        }
    static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(res, new StringBuilder(), root);
        return res;
    }
    static void helper(List<String> res, StringBuilder sb, TreeNode root){
        int initLength = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            res.add(sb.toString());
        }
        else{
            sb.append(root.val);
            sb.append("->");
        }
        if(root.right != null){
            helper(res, sb, root.right);
        }
        if(root.left != null){
            helper(res, sb, root.left);
        }
        sb.setLength(initLength);
    }
}
