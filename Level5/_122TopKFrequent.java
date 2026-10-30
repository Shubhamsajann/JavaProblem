
package Level5;

import java.util.*;

public class _122TopKFrequent {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a,b)->map.get(b)-map.get(a)
        );
        maxHeap.addAll(map.keySet());

        for (int i = 0; i < k; i++) {
            System.out.println(maxHeap.poll());
        }

    }
}