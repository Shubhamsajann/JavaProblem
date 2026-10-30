package Level4;

import java.util.HashMap;

public class _86NonRepeatingCharater {

    public static void main(String[] args) {

        String str = "aabc";

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i <str.length() ; i++) {

            char ch =str.charAt(i);
            if(map.get(ch)==1) {
                System.out.println(ch);
                return;
            }


        }


        System.out.println("No non-repeating character found");
    }

    }
