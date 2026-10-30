import java.util.HashMap;
import java.util.Map;

public class _30SubArraySum {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};

        int k = 15;

        System.out.println(SubarraySm(arr, k));
    }

    private static int SubarraySm(int[] arr, int k) {

        Map<Integer, Integer> sumCountMap = new HashMap<>();

        sumCountMap.put(0, 1);

        int result = 0;
        int prefixSum = 0;

        for (int num : arr) {

            prefixSum += num;

            if (sumCountMap.containsKey(prefixSum - k)) {
                result += sumCountMap.get(prefixSum - k);
            }

            sumCountMap.put(
                    prefixSum,
                    sumCountMap.getOrDefault(prefixSum, 0) + 1
            );
        }

        return result;
    }
}