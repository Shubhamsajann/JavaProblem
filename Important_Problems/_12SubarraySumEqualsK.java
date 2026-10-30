package Important_Problems;

import java.util.*;

public class _12SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        // Write your logic here
        int count = 0;
        int currentSum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for (int num : nums) {

          currentSum+=num;

          int diff = currentSum-k;
          if(map.containsKey(diff)){
              count+=map.get(diff);
          }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(nums, k)); // Expected: 2
    }
}
