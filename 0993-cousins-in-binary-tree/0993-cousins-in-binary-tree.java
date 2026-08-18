class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            boolean foundX = false;
            boolean foundY = false;

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                // Check if x and y are siblings
                if (curr.left != null && curr.right != null) {

                    if ((curr.left.val == x && curr.right.val == y) ||
                        (curr.left.val == y && curr.right.val == x)) {

                        return false;
                    }
                }

                if (curr.val == x) {
                    foundX = true;
                }

                if (curr.val == y) {
                    foundY = true;
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            // Same level but different parents
            if (foundX && foundY) {
                return true;
            }

            // Only one found → different depth
            if (foundX || foundY) {
                return false;
            }
        }

        return false;
    }
}