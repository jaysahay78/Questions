package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFS {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(4);
        tree.left.right = new TreeNode(6);
        tree.left.left = new TreeNode(5);
        System.out.println(BFS(tree));
    }

        public static List<List<Integer>> BFS(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }

        q.add(root);
        while (!q.isEmpty()){
            int level = q.size();
            List<Integer> subLevels = new ArrayList<>();
                for (int i = 0; i < level; i++) {
                    if (q.peek().left != null) {
                        q.add(q.peek().left);
                    }
                    if (q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    subLevels.add(q.remove().val);
                }
            ans.add(subLevels);
        }
        return ans;
        }
}
