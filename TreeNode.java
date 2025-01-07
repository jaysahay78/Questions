package com.company;
import java.util.*;

public class TreeNode {
    int val;
    int height;
    TreeNode left;
    TreeNode right;

public TreeNode root;
    public int getValue() {
        return val;
    }
    public void display(){
        display(root, " ");
    }

    private void display(TreeNode node, String indent){
        if (node ==  null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left,  indent + "\t");
        display(node.right, indent + "\t");
    }

    TreeNode(){}
        TreeNode(int val){
        this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
