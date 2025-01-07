package com.company;

public class kthSmallMorris {
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

        System.out.println(kthsmallestMorris(root, 3));
    }
    static int kthsmallestMorris(TreeNode root, int k){
        int result = -1;
        int count = 0;
        TreeNode cur = root;
        while(cur != null){
            if (cur.left == null){
                count++;
                if (count == k){
                    result = cur.val;
                }
                cur = cur.right;
            }
            else{
                TreeNode prev = cur.left;
                while(prev.right != null && prev.right != cur){
                    prev = prev.right;
                }
                if (prev.right == null){
                    prev.right = cur;
                    cur = cur.left;
                }
                else {
                    prev.right = null;
                    count++;
                    if (count == k){
                        result = cur.val;
                    }
                    cur = cur.right;
                }
            }
        }
        return result;
    }
}
