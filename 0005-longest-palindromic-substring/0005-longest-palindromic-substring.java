class Solution {

    int start = 0;
    int end = 0;

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {

            expand(s, i, i);       // Odd length
            expand(s, i, i + 1);   // Even length
        }

        return s.substring(start, end + 1);
    }

    private void expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // Actual palindrome length
        if (right - left - 1 > end - start + 1) {

            start = left + 1;
            end = right - 1;
        }
    }
}