package com.company;

import javafx.util.Pair;

import java.util.*;

public class bottomView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> bottom = botview(root);
        System.out.println(bottom);

    }

    static List<Integer> botview(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null){return ans;}

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0));

        while (!q.isEmpty()){
            Pair<TreeNode, Integer> pair = q.poll();
            TreeNode node = pair.getKey();
            int line = pair.getValue();

            map.put(line, node.val);

            if (node.left != null){
                q.add(new Pair<>(node.left, line-1));
            }
            if (node.right != null){
                q.add(new Pair<>(node.right, line+1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){ //transfer values from map to the result list
            ans.add(entry.getValue());
        }
        return ans;
    }
}
