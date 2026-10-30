
package Level5;

import java.util.HashMap;

public class _111CheckArraysEqual {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 20};
        int[] arr2 = {20, 10, 20, 30};

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count elements in the first array
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Subtract frequencies using the second array
        for (int num : arr2) {

            if (!map.containsKey(num)) {
                System.out.println("Arrays are not equal");
                return;
            }

            map.put(num, map.get(num) - 1);

            if (map.get(num) < 0) {
                System.out.println("Arrays are not equal");
                return;
            }
        }

        System.out.println("Arrays are equal");
    }
}
