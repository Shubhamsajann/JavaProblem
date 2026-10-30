
package Level5;

import java.util.HashMap;

public class _119CountSubarraysSumK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 1};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        // An empty prefix has sum 0 and occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {

            prefixSum += num;

            int needed = prefixSum - k;

            // Count all earlier prefix sums that match
            count += map.getOrDefault(needed, 0);

            // Record the current prefix sum
            map.put(
                    prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println("Count: " + count);
    }
}
