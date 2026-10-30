package Book1;

import java.util.HashMap;
import java.util.Map;

public class _11KFrequentElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (int count = 0; count < k; count++) {
            int maxFreq = -1;
            int maxElement = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxElement = entry.getKey();
                }
            }

            System.out.print(maxElement + " ");
            freq.remove(maxElement);


        }

    }
}

