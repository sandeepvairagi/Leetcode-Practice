class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, ans);

        return ans;
    }

    void dfs(TreeNode root, int targetSum,
             List<Integer> path,
             List<List<Integer>> ans) {

        if (root == null) {
            return;
        }

        // Current node ko path mein add karo
        path.add(root.val);

        // Leaf node + target complete
        if (root.left == null && root.right == null
                && targetSum == root.val) {

            ans.add(new ArrayList<>(path));
        }

        // Left subtree
        dfs(root.left, targetSum - root.val, path, ans);

        // Right subtree
        dfs(root.right, targetSum - root.val, path, ans);

        // Backtrack
        path.remove(path.size() - 1);
    }
}