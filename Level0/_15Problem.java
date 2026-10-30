package Level0;

import java.util.HashMap;
import java.util.Scanner;

class _15Problem {
    public static void main(String[] args) {

        int[] arr ={10,20,30,40,50,10,20,30};
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int num : arr) {

            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }

}