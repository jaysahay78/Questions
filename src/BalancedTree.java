public class BalancedTree {

        // Function to check if a binary tree is balanced
        static boolean isBalanced(TreeNode root) {
            // Check if the tree's height difference
            // between subtrees is less than 2
            // If not, return false; otherwise, return true
            return dfsHeight(root) != -1;
        }

        // Recursive function to calculate
        // the height of the tree
        static int dfsHeight(TreeNode root) {
            // Base case: if the current node is NULL,
            // return 0 (height of an empty tree)
            if (root == null) return 0;

            // Recursively calculate the
            // height of the left subtree
            int leftHeight = dfsHeight(root.left);

            // If the left subtree is unbalanced,
            // propagate the unbalance status
            if (leftHeight == -1)
                return -1;

            // Recursively calculate the
            // height of the right subtree
            int rightHeight = dfsHeight(root.right);

            // If the right subtree is unbalanced,
            // propagate the unbalance status
            if (rightHeight == -1)
                return -1;

            // Check if the difference in height between
            // left and right subtrees is greater than 1
            // If it's greater, the tree is unbalanced,
            // return -1 to propagate the unbalance status
            if (Math.abs(leftHeight - rightHeight) > 1)
                return -1;

            // Return the maximum height of left and
            // right subtrees, adding 1 for the current node
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static void main(String[] args) {
            // Creating a sample binary tree
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.left.right.right = new TreeNode(6);
            root.left.right.right.right = new TreeNode(7);

            // Checking if the tree is balanced
            if (isBalanced(root)) {
                System.out.println("The tree is balanced.");
            } else {
                System.out.println("The tree is not balanced.");
            }
        }
    }
