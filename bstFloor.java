public class bstFloor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);

        System.out.println(BSTfloor(root, 7));
    }
    static int BSTfloor(TreeNode root, int key){
        int floor = -1;
        while(root != null) {
            if (root.val == key) {
                return root.val;
            }
            else if (key > root.val) {
                floor = root.val;
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
        return floor;
    }
}
