
package Level5;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _123ISIsomorphic {



        public static void main (String[]args){
            System.out.println(isIsomorphic("egg", "add"));
            System.out.println(isIsomorphic("foo", "bar"));
            System.out.println(isIsomorphic("paper", "title"));



    }

    private static boolean isIsomorphic(String s, String t) {

            if(s.length()!=t.length()) return false;

            HashMap<Character,Character> map1 = new HashMap<>();
            HashMap<Character,Character> map2 = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map1.containsKey(a)&& map1.get(a)!=b)
            {
                return false;
            }

            if(map2.containsKey(b) && map2.get(b)!=a){
                return false;
            }

            map1.put(a, b);
            map2.put(b, a);
        }


        return true;

    }
}