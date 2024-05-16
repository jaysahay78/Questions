public class invertTree {
    static TreeNode invertTree(TreeNode root){
        if (root.left == null || root.right == null){
            return root;
        }
        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left.left = invertTree(root.right.right);
        root.right.right = invertTree(root.left.left);
        return root;
    }
}
