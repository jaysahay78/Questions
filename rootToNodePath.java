import java.util.ArrayList;
import java.util.List;

public class rootToNodePath {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(6);
        node.left.right.right = new TreeNode(7);

        List<Integer> arr = rootoNode(node,7);
        System.out.println(arr);

    }
    static List<Integer> rootoNode(TreeNode root, int target){
        List<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        helper(root, ans, target);
        return ans;
    }

    static boolean helper(TreeNode root, List<Integer> ans, int target){
        if (root == null){
            return false;
        }
        ans.add(root.val); //her ans.add automatically adds the node values to ans
        if (root.val == target){ //we just need to specify if the values being added
            return true; //contain the target or not
        }
        if (helper(root.left, ans, target) || helper(root.right, ans, target)){//here the left node values
            return true; //as well as the right node values are added again
        }

        ans.remove(ans.size()-1);
        return false;
    }
}
