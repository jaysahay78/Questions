import java.util.*;

public class TopView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(9);

        List<Integer> topView = topview(root);
        System.out.println(topView);
    }
    static List<Integer> topview(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null){return ans;}
        Map<Integer, Integer> map = new TreeMap<>(); //for our map the key is line or vertical and value is TreeNode
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>(); //for pair keys are TreeNodes in level order and value
                                                                //is the value of the vertical for that specific TreeNode

        q.add(new Pair<>(root, 0));

        while(!q.isEmpty()) {    //initiating BFS
            Pair<TreeNode, Integer> pair = q.poll(); //get the first node and its vertical from the top of queue
            TreeNode node = pair.getKey(); //we create a Pair named pair to use it for adding our parameters to the map
            int line = pair.getValue();

            //now start adding the key and value from the pair to the map
            if (!map.containsKey(line)) {
                map.put(line, node.val);
            }

            if (node.left != null) { //we check for the left of the root node
                q.add(new Pair<>(node.left, line - 1)); //add the node and the vertical-1 to the queue
            }
            if (node.right != null) {
                q.add(new Pair<>(node.right, line + 1)); //add the node and the vertical-1 to the queue
            }
        }
        for (int value : map.values()){ //transfer values from map to the result list
            ans.add(value);
        }
        return ans;
    }
}