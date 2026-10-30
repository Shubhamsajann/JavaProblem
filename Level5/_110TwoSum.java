
package Level5;

import java.util.Arrays;
import java.util.HashMap;

public class _110TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            // Number needed to reach the target
            int complement = target - num;

            // Check whether the required number was seen earlier
            if (map.containsKey(complement)) {
                System.out.println(
                        Arrays.toString(
                                new int[]{map.get(complement), i}
                        )
                );
                return;
            }

            // Store the number and its index
            map.put(num, i);
        }

        System.out.println("No pair found");
    }
}
