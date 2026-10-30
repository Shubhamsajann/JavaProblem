
package Level5;

import java.util.HashSet;

public class _117LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Store all numbers in the set
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Find the start of each sequence
        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Step 3: Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println(
                "Longest consecutive sequence length: " + longest
        );
    }
}
