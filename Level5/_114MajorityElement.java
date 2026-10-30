
package Level5;

import java.util.HashMap;
import java.util.Map;

public class _114MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count the frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > arr.length / 2) {
                System.out.println(
                        "Majority element: " + entry.getKey()
                );
                return;
            }
        }

        System.out.println("No majority element");


        int candidate = 0;

        int count = 0;

        for (int num : arr){

            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            } else {
                count--;



            }
        }
    }
}
