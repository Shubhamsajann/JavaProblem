package Leetcode;

public class _409LongestPalindrome {

    public static int longestPalindrome(String s) {

        int[] freq = new int[128];

        // Count characters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Use pairs
        for (int count : freq) {

            length += (count / 2) * 2;

            // Check if count is odd
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd character can be placed in the middle
        if (hasOdd) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "abccccdd";

        System.out.println(longestPalindrome(s));
    }
}