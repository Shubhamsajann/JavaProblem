
package Book1;

import java.util.HashMap;

public class _19Anagram {

    public static void main(String[] args) {
String s1= "abcd";
String s2 = "dcba";

        System.out.println(isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s1,String s2) {

        HashMap<Character,Integer> map =new HashMap<>();

    for (char ch : s1.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for (char ch : s2.toCharArray()){
        if(!map.containsKey(ch)){
return false;

        }
        map.put(ch,map.get(ch)-1);
        if(map.get(ch)<0){
            return false;
        }
    }

        return true;
    }


}
