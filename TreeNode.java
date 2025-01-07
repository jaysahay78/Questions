import java.util.*;

public class TreeNode {
    int val;
    int height;
    TreeNode left;
    TreeNode right;

    public int getValue() {
        return val;
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
