
package Level4;

import java.util.HashMap;

public class _87ValidAnagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in str1
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check characters in str2
        for (char ch : str2.toCharArray()) {

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                System.out.println(false);
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        System.out.println(true);
    }
}
