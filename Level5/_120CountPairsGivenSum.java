
package Level5;

import java.util.HashMap;

public class _120CountPairsGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : arr) {

            int complement = target - num;

            // Count earlier numbers that complete the pair
            count += map.getOrDefault(complement, 0);

            // Store the current number's frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Count: " + count);
    }
}
