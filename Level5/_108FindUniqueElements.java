
package Level5;

import java.util.HashMap;
import java.util.Map;

public class _108FindUniqueElements {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print elements that appear only once
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}
