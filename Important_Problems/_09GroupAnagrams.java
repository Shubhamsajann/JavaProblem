package Important_Problems;

import java.util.*;

public class _09GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Write your logic here

        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
HashMap<String ,List<String>> map = new HashMap<>();

for(String s : strs){
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    String SortedKey = new String(chars);


    if(!map.containsKey(SortedKey)){
        map.put(SortedKey,new ArrayList<>());
    }
    map.get(SortedKey).add(s);
}
        return new ArrayList<>(map.values());


    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
