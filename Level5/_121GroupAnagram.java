
package Level5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _121GroupAnagram {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        int target = 6;

        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : arr){

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);

        }
        System.out.println(map.values());
    }
}