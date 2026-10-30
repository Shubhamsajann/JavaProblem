package Important_Problems.Revise;

import java.util.*;

public class _16LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        // Write your logic here

        if(s==null || s.length()==0) return 0;
        int left =0;
        int maxLength =0;

        Map<Character,Integer> map = new HashMap<>();

        for (int right = 0; right <s.length() ; right++) {

            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            map.put(ch,right);

            maxLength=Math.max(maxLength,right-left+1);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Expected: 3
    }
}
