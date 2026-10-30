
package Level5;

import java.util.HashSet;

public class _116ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5, 5};

        HashSet<Integer> set = new HashSet<>();

        boolean containsDuplicate = false;

        for (int num : arr) {

            // Check whether the number already exists
            if (set.contains(num)) {
                containsDuplicate = true;
                break;
            }

            // Store the number
            set.add(num);
        }

        System.out.println(containsDuplicate);
    }
}
