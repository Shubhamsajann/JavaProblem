
package Level5;

import java.util.HashMap;

public class _109FirstNonRepeating {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 10, 40, 50};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the first element with frequency 1
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println(num);
                return;
            }
        }

        System.out.println("No non-repeating element found");
    }
}
