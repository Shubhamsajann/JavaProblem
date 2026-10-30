
package Level5;

import java.util.HashSet;

public class _112ArrayIntersection {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {30, 40, 50, 60};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Step 1: Store elements of arr1
        for (int num : arr1) {
            set.add(num);
        }

        // Step 2: Find elements also present in arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println(intersection);
    }
}
