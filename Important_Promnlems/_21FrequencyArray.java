package Important_Promnlems;

import java.util.HashMap;
import java.util.HashSet;

public class _21FrequencyArray {

    public static void frequency(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int x : arr) {
           map.put(x,map.getOrDefault(x,0)+1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = { 1,1, 2, 3, 4};

frequency(arr);
    }
}
