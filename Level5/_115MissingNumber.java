
package Level5;

import java.util.HashSet;

public class _115MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Store all array elements
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Check numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            if (!set.contains(i)) {
                System.out.println("Missing number: " + i);
                return;
            }
        }

        System.out.println("No missing number found");
    }
}
