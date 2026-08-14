class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        // Linked List → ArrayList
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] ans = new int[list.size()];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < list.size(); i++) {

            while (!st.isEmpty() && list.get(st.peek()) < list.get(i)) {

                int index = st.pop();

                ans[index] = list.get(i);
            }

            st.push(i);
        }

        return ans;
    }
}