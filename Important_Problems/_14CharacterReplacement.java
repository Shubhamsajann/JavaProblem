package Important_Problems;

import java.util.*;

public class _14CharacterReplacement {

    public static int characterReplacement(String s, int k) {
        // Write your logic here
        int[] freq =new int[26];
        int left =0;
        int maxCount=0;
        int maxLength = 0;

        for (int right = 0; right <s.length() ; right++) {

            char ch =s.charAt(right);

            freq[ch-'A']++;

            maxCount=Math.max(maxCount,freq[ch-'A']);


while( (right-left+1)-maxCount >k){
    freq[s.charAt(left)-'A']--;
    left++;

}
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k)); // Expected: 4
    }
}
