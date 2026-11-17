package Day01;

import java.util.*;

 class GroupAnagrams {

    static List<List<String>> groupAnagram(String[] str){

        HashMap<String , List<String>> map = new HashMap<>();

        for (String s : str){
            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String key = new String(ch);
      map.putIfAbsent(key,new ArrayList<>());
      map.get(key).add(s);


            }
return new ArrayList<>(map.values());

        }




     static void main(String[] args) {

        String[] str = {"eat","tea","tan","ate","nat","bat"};

         System.out.println(groupAnagram(str));


    }
}
