
package Level5;

import java.util.HashSet;

public class _107FindDuplicate {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 10, 20, 40, 50, 60};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i : arr) {

            // Check whether the number already exists
            if (seen.contains(i)) {
                duplicate.add(i);
            }

            // Store the number in seen
            seen.add(i);
        }

        System.out.println("Duplicate elements: " + duplicate);
    }
}
