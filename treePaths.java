import java.util.ArrayList;
import java.util.List;

public class treePaths {
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
