class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        if (root == null) {
            return ans;
        }

        st.push(root);

        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            ans.add(0, curr.val);

            if (curr.left != null) {
                st.push(curr.left);
            }

            if (curr.right != null) {
                st.push(curr.right);
            }
        }

        return ans;
    }
}