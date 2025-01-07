import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigZagTree {

    public class Test {
        public static void main(String[] args) {
            TreeNode tree = new TreeNode(2);
            tree.left = new TreeNode(3);
            tree.right = new TreeNode(4);
            tree.left.right = new TreeNode(6);
            tree.left.left = new TreeNode(5);
            System.out.println(zigZag(tree));
        }

        static List<List<Integer>> zigZag(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
            if(root == null) {
                return ans;
            }
            q.add(root);
            boolean flag = true;
            while(!q.isEmpty()) {
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    if (q.peek().left != null) {
                        q.add(q.peek().left);
                    }
                    if (q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    if (flag) {
                        list.add(q.remove().val);
                    } else {
                        list.add(0, q.remove().val);
                    }
                }
                ans.add(list);
                flag = !flag;
            }
            return ans;
        }
    }

}
