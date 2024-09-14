public class insertNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);

        TreeNode node = new TreeNode(6);


    }
    static TreeNode insertNode(TreeNode root, int val){
        if (root == null){return new TreeNode(val);}
        TreeNode cur = root;
        while (true){
            if (cur.val <= val) {
                if (cur.right != null) {cur = cur.right;}
                else {
                    cur.right = new TreeNode(val);
                    break;
                }
            }
            else {
                if (cur.left != null){
                    cur = cur.left;
                }
                else {cur.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
