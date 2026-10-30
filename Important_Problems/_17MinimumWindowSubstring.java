package Important_Problems;

import java.util.*;

public class _17MinimumWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); // Expected: "BANC"
    }

    public static String minWindow(String s, String t) {


        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int minsize =Integer.MAX_VALUE;
        HashMap<Character,Integer> targetMap= new HashMap<>();

        for(char c : t.toCharArray()){
            targetMap.put(c,targetMap.getOrDefault(c,0)+1);
        }

        int left = 0, minLen = Integer.MAX_VALUE;

        int startIndex = 0;
        int requiredTypeCount = targetMap.size(); // Number of unique characters to match
        int formedMatches = 0;

        HashMap<Character, Integer> windowMap = new HashMap<>();
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);

    }

}
