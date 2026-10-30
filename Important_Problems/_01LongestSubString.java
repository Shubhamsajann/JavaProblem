package Important_Problems;

import java.util.HashMap;

public class _01LongestSubString {

    public static int findLongest(String s){

        if(s==null || s.isEmpty()) return 0;

        HashMap<Character,Integer> map =new HashMap<>();

        int maxLength =0;
        int left = 0;

       for (int right = 0;right<s.length();right++){
           char curr = s.charAt(right);

           if(map.containsKey(curr) && map.get(curr)>=left) {
               left = map.get(curr) + 1;
           }
               map.put(curr,right);
               maxLength=Math.max(maxLength,right-left+1);


       }
       return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
      int n =   findLongest(s);

        System.out.println(n);
    }
}
