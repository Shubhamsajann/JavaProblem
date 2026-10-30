
package Level5;

import java.util.HashSet;

public class _113ArrayUnion {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {30, 40, 50, 60};

        HashSet<Integer> union = new HashSet<>();

        // Add all elements from the first array
        for (int num : arr1) {
            union.add(num);
        }

        // Add all elements from the second array
        for (int num : arr2) {
            union.add(num);
        }

        System.out.println(union);
    }
}
