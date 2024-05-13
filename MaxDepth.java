public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.right.right = new TreeNode(4);

        System.out.println(treeHeight(root1));
    }

    static int treeHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        return 1 + Math.max(lh, rh);
    }
}