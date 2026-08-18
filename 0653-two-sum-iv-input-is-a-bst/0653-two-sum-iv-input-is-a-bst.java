class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }

    public boolean dfs(TreeNode root, int k, HashSet<Integer> set) {

        if (root == null) {
            return false;
        }

        int required = k - root.val;

        if (set.contains(required)) {
            return true;
        }

        set.add(root.val);

        return dfs(root.left, k, set) ||
               dfs(root.right, k, set);
    }
}