class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Sirf right subtree hai
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        // Sirf left subtree hai
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}