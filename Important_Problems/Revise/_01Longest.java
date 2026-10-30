
package Important_Problems.Revise;

import java.util.HashMap;
import java.util.Map;

public class _01Longest {

    public static int longest(String s) {
        int left = 0;
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);

            if (map.containsKey(curr) && map.get(curr) >= left) {
                left = map.get(curr) + 1;
            }

            map.put(curr, right);
            max = Math.max(max, right - left + 1);
        }

        return max+1;
    }

    public static void main(String[] args) {
        String s = "shubhham";
        System.out.println(longest(s));
    }
}
