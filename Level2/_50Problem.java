package Level2;

import java.util.HashMap;

// Two Sum using Brute Force
public class _50Problem {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2};
        int target = 6;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            int needed = target-arr[i];
            if(map.containsKey(needed)){
                System.out.println(needed+" "+arr[i]);
                System.out.println("index "+map.get(needed)+" "+i);
                return;
            }
            map.put(arr[i],i);
        }
    }
}