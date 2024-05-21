public class diameter {
    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1]; //SINCE IN JAVA WE CANT PASS BY REFERENCE SO WE USE A SINGLE ELEMENT ARRAY INSTEAD
        height(root, diameter);
        return diameter[0];
    }
    static int height(TreeNode root, int[] diameter){
        if(root == null){
            return 0;
        }
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(lh+rh, diameter[0]);
        return Math.max(lh,rh) + 1;
    }
}
