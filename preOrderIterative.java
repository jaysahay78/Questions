package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preOrderIterative {
    public static void main(String[] args) {
    }

    static List<Integer> preOrderIteration(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            ans.add(root.val);
            if (root.left != null){
                st.push(root.left);
            }
            if (root.right != null){
                st.push(root.right);
            }
        }
        return ans;
    }
}
