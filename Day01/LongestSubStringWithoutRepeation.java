package Day01;


import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeation {

    public  static int longestSubString(String s){

        int left = 0;
        int longestSubString =0;
        HashMap<Character,Integer> map=new HashMap<>();

        for (int right =0;right<s.length();right++){

            char ch = s.charAt(right);

            if(map.containsKey(right)){
                left+=map.get(right);
            }

            map.put(ch,map.getOrDefault(ch,0)+1);

            longestSubString= Math.max(longestSubString,right-left+1);

        }
        return longestSubString;
    }

    public static void main(String[] args) {
        String s = "shushu";

        int n = longestSubString(s);

        System.out.println(n);

    }
}

