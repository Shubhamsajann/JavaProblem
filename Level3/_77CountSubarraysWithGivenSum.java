package Level3;

import java.util.HashMap;

public class _77CountSubarraysWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 1,1};
        int target = 3;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int sum =0;
        int count =0;

        for(int num : arr){
            sum+=num;

            int needed = sum - target;

            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(count);
    }



    }
