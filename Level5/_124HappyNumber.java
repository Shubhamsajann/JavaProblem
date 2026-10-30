
package Level5;

import java.util.HashMap;
import java.util.HashSet;

public class _124HappyNumber {



        public static void main (String[]args){

            int[] arr = {10, 5, 2, 7, 1, 9};
            int k = 15;

            System.out.println(longestSubarray(arr, k));


    }

    private static int longestSubarray(int[] arr, int k) {

            HashMap<Integer,Integer> map = new HashMap<>();

            int prefixSum =0;
            int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum+=arr[i];

            if(prefixSum == k){
                maxLength=i+1;
            }


            int needed = prefixSum-k;

            if(map.containsKey(needed)){
                int length = i-map.get(needed);
                maxLength=Math.max(maxLength,length);

            }

            map.putIfAbsent(prefixSum,i);
        }
        return maxLength;
    }


}